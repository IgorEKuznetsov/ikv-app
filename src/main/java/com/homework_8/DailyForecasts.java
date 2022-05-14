package com.homework_8;

import javax.json.JsonObject;

public class DailyForecasts {
    private String date;
    private double temperatureMinimum;
    private double temperatureMaximum;
    private String dayDescription;
    private String nightDescription;

    public DailyForecasts(JsonObject jsonObject) {
        date = jsonObject.getString("Date");
        temperatureMinimum = jsonObject
                .getJsonObject("Temperature")
                .getJsonObject("Minimum")
                .getJsonNumber("Value")
                .doubleValue();
        temperatureMaximum = jsonObject
                .getJsonObject("Temperature")
                .getJsonObject("Maximum")
                .getJsonNumber("Value")
                .doubleValue();
        dayDescription = jsonObject
                .getJsonObject("Day")
                .getString("IconPhrase");
        nightDescription = jsonObject
                .getJsonObject("Night")
                .getString("IconPhrase");
    }

    public String getDate() {
        return date;
    }

    public double getTemperatureMinimum() {
        return temperatureMinimum;
    }

    public double getTemperatureMaximum() {
        return temperatureMaximum;
    }

    public String getDayDescription() {
        return dayDescription;
    }

    public String getNightDescription() {
        return nightDescription;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("date: " + date + "\n");
        stringBuilder.append("temperature minimum: " + temperatureMinimum + "C\n");
        stringBuilder.append("temperature maximum: " + temperatureMaximum + "C\n");
        stringBuilder.append("day description: " + dayDescription + "\n");
        stringBuilder.append("night description: " + nightDescription + "\n" + "\n");

        return stringBuilder.toString();
    }
}
