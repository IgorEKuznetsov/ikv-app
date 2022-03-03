package com.homework_5;


import java.util.Arrays;

public class AppData {
    private String[] header;
    private String[][] data;

    public AppData(String[] header, String[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        String result = "";
        for (String value : header) {
            result += value + ";";
        }
        result += "\n";

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result += data[i][j] + ";";
            }
            result += "\n";
        }
        return result;
    }


}
