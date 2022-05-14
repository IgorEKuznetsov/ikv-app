package com.homework_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpClient {
    public String getFiveDaysWeatherResponse() {
        final String WEATHER_HOST = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021";
        final String API_KEY = "?apikey=3f3ToB6IXFQR5s03EZt2XRR7tByJUKi7";
        final String IS_METRIC = "&metric=true";

        StringBuilder responseContent = new StringBuilder();
        String line;
        BufferedReader buf;

        try {
            URL url = new URL(WEATHER_HOST + API_KEY + IS_METRIC);
            HttpURLConnection hpCon = (HttpURLConnection) url.openConnection();

            hpCon.setRequestMethod("GET");
            hpCon.setConnectTimeout(5000);
            hpCon.setReadTimeout(5000);

            if (hpCon.getResponseCode() >= 200 && hpCon.getResponseCode() < 300) {
                buf = new BufferedReader(new InputStreamReader(hpCon.getInputStream()));
                while ((line = buf.readLine()) != null) {
                    System.out.println("status: " + hpCon.getResponseCode());
                    responseContent.append(line);
                    return responseContent.toString();
                }
                buf.close();
            } else {
                buf = new BufferedReader(new InputStreamReader(hpCon.getErrorStream()));
                while ((line = buf.readLine()) != null) {
                    System.out.println("status: " + hpCon.getResponseCode());
                    responseContent.append(line);
                    return responseContent.toString();
                }
                buf.close();
            }
            if (hpCon != null) hpCon.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
