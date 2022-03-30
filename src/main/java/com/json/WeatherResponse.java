package com.json;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.Arrays;

public class WeatherResponse {
    private DailyForecasts[] dailyForecasts;

    public WeatherResponse(JsonObject jsonObject) {
        JsonArray dailyForecastArr = jsonObject.getJsonArray("DailyForecasts");
        dailyForecasts = new DailyForecasts[dailyForecastArr.size()];
        for (int i = 0; i < dailyForecasts.length; i++) {
            JsonObject dailyForecastObj = dailyForecastArr.getJsonObject(i);
            DailyForecasts daily = new DailyForecasts(dailyForecastObj);
            dailyForecasts[i] = daily;
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
