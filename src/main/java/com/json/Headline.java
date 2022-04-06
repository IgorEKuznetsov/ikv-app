package com.json;

import javax.json.JsonObject;

public class Headline {
    private int severity;
    private String text;

    public Headline(JsonObject jsonObject){
        severity = jsonObject
                .getJsonObject("Headline")
                .getInt("Severity");
        text = jsonObject
                .getJsonObject("Headline")
                .getString("Text");
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Severity: " + severity + "\n");
        stringBuilder.append("Text: " + text);

        return stringBuilder.toString();
    }
}
