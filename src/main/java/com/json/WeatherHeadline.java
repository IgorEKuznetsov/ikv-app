package com.json;

import javax.json.JsonObject;

public class WeatherHeadline {
    private Headline headline;

    public WeatherHeadline(JsonObject jsonObject) {
        // JsonObject headlineObject = jsonObject.getJsonObject("Headline");
         headline = new Headline(jsonObject);

    }
    @Override
    public String toString(){
        return headline.toString();
    }
}
