/**
 *  Java core. Homework_2
 *
 * @autor Igor Kuznetsov
 * @version 19.02.2022
 */
package com.core;

public class Homework_2 {
    private static String s = "X";
    static String[][] myArray = new String[5][4];
    static String[][] myArray1 = {{"2", "3", "4", "5"}, {"3", "3", "1", "1"}, {"4", "6", "7", "9"}, {"2", "2", "1", "1"}};
    static String[][] myArray2 = {{"2", "3", "4", "5"}, {"3", "3", "1", "1"}, {"4", s, "7", "9"}, {"2", "2", "1", "1"}};

    public static void main(String[] args) {
        try {
            // testArray(myArray);
            testArray(myArray1);
            testArray(myArray2);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void testArray(String[][] arr) {
        int counter = 0;
        if (arr.length > 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != s) {
                    counter += Integer.valueOf(arr[i][j]);
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(s + " - (i = " + i + " ,j = " + j + ")");
                    throw new MyArrayDataException();
                }

            }
        }
        System.out.println();
        System.out.println("Sum of array[][] = " + counter);


    }
}

class MyArraySizeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "The size of incoming array was exceeded ";

    }
}

class MyArrayDataException extends NumberFormatException {
    @Override
    public String getMessage() {
        return " is not a number!!!";

    }
}
