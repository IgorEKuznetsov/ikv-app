package com.homework_4;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        String[] arrOfWords = {"Apple", "Board", "Array", "Java", "Object", "Apple", "Array", "Array", "Language", "Table", "Fork", "OOP", "Lesson", "Java", "Apple"};
        Map<String, Integer> mapList = new HashMap<>();
        List<String> arrListAll = new ArrayList<>();
        String s;
        for (String word : arrOfWords) {
            arrListAll.add(word);
        }
        for (String word : arrListAll) {
            s = arrListAll.get(arrListAll.indexOf(word));
            if (!mapList.containsKey(s)) {
                mapList.put(s, 1);
            } else {
                mapList.put(s, mapList.get(s) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mapList.entrySet()) {
            System.out.println("Слово " + entry.getKey() + ", повторений: " + entry.getValue());
        }
    }
}