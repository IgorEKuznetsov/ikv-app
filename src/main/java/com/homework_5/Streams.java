package com.homework_5;

import java.io.FileOutputStream;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        byte[] byteData = null;
        String[] header = {"Value 1", "Value 2", "Value 7"};
        String[][] data = {{"100", "201", "123"}, {"300", "400", "500"}};

        try (FileOutputStream out = new FileOutputStream("someData.csv")) {
            AppData appData = new AppData(header, data);
            System.out.println(appData);
            byteData = appData.toString().getBytes(StandardCharsets.UTF_8);
            out.write(byteData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("someData.csv")) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch  (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
