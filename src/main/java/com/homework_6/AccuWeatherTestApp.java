package com.homework_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class AccuWeatherTestApp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/294021?apikey=3f3ToB6IXFQR5s03EZt2XRR7tByJUKi7");
        HttpURLConnection hpCon = (HttpURLConnection) url.openConnection();
        hpCon.setConnectTimeout(5000);
        hpCon.setReadTimeout(5000);
        hpCon.setDoInput(true);
        hpCon.setRequestMethod("GET");
        hpCon.setRequestProperty("accept", "application/json");
        hpCon.connect();
        if (hpCon.getResponseCode() >= 200 && hpCon.getResponseCode() < 300) {
            try (BufferedReader buf = new BufferedReader(new InputStreamReader(hpCon.getInputStream(), "utf-8"))) {
                String line;
                while ((line = buf.readLine()) != null) {
                    System.out.println("Response body: " + "\n" + line);
                }
            }
        } else {
            System.out.println("Код: " + hpCon.getResponseCode());
        }
        if (hpCon != null) hpCon.disconnect();

        System.out.println("Response headers: ");
        Map<String, List<String>> headers = hpCon.getHeaderFields();
        for (String key : headers.keySet()) {
            System.out.printf("%s: %s \n", key, headers.get(key));
        }
    }
}
