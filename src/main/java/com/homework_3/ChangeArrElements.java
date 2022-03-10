package com.homework_3;

import java.util.Arrays;

public class ChangeArrElements {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 7, 10, 0};
        changeArrayElements(ints, 4, 5);
        changeArrayElements(ints, 0, 4);
        changeArrayElements(ints, 0, -1);
        changeArrayElements(ints, -5, 10);
        changeArrayElements(ints, 0, 0);
    }

    public static <T> void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
        if ((firstIndex <= array.length - 1) && (secondIndex <= array.length - 1) && (firstIndex >= 0 && secondIndex >= 0)) {
            System.out.println(Arrays.toString(array));
            T arrayElement = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = arrayElement;
            System.out.println(Arrays.toString(array));
        } else System.out.println("Wrong input index");
    }
}
