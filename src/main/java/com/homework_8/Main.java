package com.homework_8;
import com.homework_7.WeatherResponse;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String forecastJson = new HttpClient().getFiveDaysWeatherResponse();
        if (forecastJson != null) {
            StringReader stringReader = new StringReader(forecastJson);
            JsonReader jsonReader = Json.createReader(stringReader);
            JsonObject jsonObject = jsonReader.readObject();
            System.out.println(jsonObject);

            WeatherResponse weatherResponse = new WeatherResponse(jsonObject);
            System.out.println(weatherResponse);
        }
    }
}
