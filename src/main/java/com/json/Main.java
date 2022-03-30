package com.json;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String forecastJson = new HttpClient().fiveDaysWeatherResponse();

        StringReader stringReader = new StringReader(forecastJson);
        JsonReader jsonReader = Json.createReader(stringReader);

        JsonObject jsonObject = jsonReader.readObject();
        System.out.println(jsonObject);

       // Headline headline = new Headline(jsonObject);
       // System.out.println(headline);

        WeatherResponse weatherResponse = new WeatherResponse(jsonObject);
        System.out.println(weatherResponse);


    }
}
