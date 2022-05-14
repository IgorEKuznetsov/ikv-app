package com.homework_8;

import com.homework_7.DailyForecasts;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.sql.*;

public class WeatherResponse {
    private DailyForecasts[] dailyForecasts;
    private static String sqlCreateForecastTable = "CREATE TABLE IF NOT EXISTS forecasts (id integer PRIMARY KEY, localDate text, dayText text, nightText text, minTemperature real, maxTemperature real);";
    private static String sqlInsertQueryWithParameter = "INSERT INTO forecasts(localDate, dayText, nightText, minTemperature, maxTemperature) VALUES(?, ?, ?, ?, ?);";
    private String sqlSelectForecastFromTable = "SELECT * FROM forecasts;";
    private String url = "jdbc:sqlite:weatherForecast.db";


    public WeatherResponse(JsonObject jsonObject) {
        JsonArray dailyForecastArr = jsonObject.getJsonArray("DailyForecasts");
        dailyForecasts = new DailyForecasts[dailyForecastArr.size()];
        for (int i = 0; i < dailyForecasts.length; i++) {
            JsonObject dailyForecastObj = dailyForecastArr.getJsonObject(i);
            DailyForecasts daily = new DailyForecasts(dailyForecastObj);
            dailyForecasts[i] = daily;
        }

        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertQueryWithParameter)
        ) {
            System.out.println("Connection established!");
            statement.execute(sqlCreateForecastTable);
            for (DailyForecasts df : dailyForecasts) {
                preparedStatement.setString(1, df.getDate());
                preparedStatement.setString(2, df.getDayDescription());
                preparedStatement.setString(3, df.getNightDescription());
                preparedStatement.setDouble(4, df.getTemperatureMinimum());
                preparedStatement.setDouble(5, df.getTemperatureMaximum());
                preparedStatement.execute();
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void forecastResponse() {
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()
        ) {
            ResultSet weatherResultSet = statement.executeQuery(sqlSelectForecastFromTable);
            while (weatherResultSet.next()) {
                String date = weatherResultSet.getString("localDate");
                String dayText = weatherResultSet.getString("dayText");
                String nightText = weatherResultSet.getString("nightText");
                double minTemperature = weatherResultSet.getDouble("minTemperature");
                double maxTemperature = weatherResultSet.getDouble("maxTemperature");
                System.out.println(date + " " + dayText + " " + nightText + " " + minTemperature + " " + maxTemperature);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Прогноз погоды в мск на 5 дней:" + "\n");
        for (DailyForecasts df : dailyForecasts) {
            stringBuilder.append(df.toString());
        }
        return stringBuilder.toString();
    }
}
