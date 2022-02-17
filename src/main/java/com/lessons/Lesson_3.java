package com.lessons;

import java.util.Arrays;
import java.util.Random;

public class Lesson_3 {



    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 7, 10, 1};
        //System.out.println(arrSum(arr1));
        //task_one();
        // task_two();
        //  task_three();
        //  task_four();
       //task_five(10, 5);
       // task_six();
      //  System.out.println(task_seven());
        System.out.println(Arrays.toString(createAndFillArray(10, false, 1)));
        System.out.println(Arrays.toString(createAndFillArray(10, true, 1)));
       // System.out.println(Arrays.toString(createAndFillArray(5,7)));
    }


    static void task_one() {
        int[] arr = {1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void task_two() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task_three() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task_four() {
        int a = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = a;
                }
                System.out.print(table[i][j] + " ");
            }

        }
    }

    static void task_four_1() {
        int a = 0;
        int b = 3;
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[a][b] = 1;
                System.out.print(table[i][j] + " ");
            }
        }
    }

    static void task_five(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void task_six() {
        int[] arr1 = {2, 4, 1, 7, 10, 1};
        Arrays.sort(arr1);
        System.out.println(arr1[0] + " " + arr1[5]);
    }

    static boolean task_seven() {
        int sum = 0;
        int half = 0;
        int sumL = 0;
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            half = sum / 2;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            sumL += arr[i];
            if (sumL == half) {return true;}
        }
        return false;
    }
    static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static int[] createAndFillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static int[] createAndFillArray(int len, boolean rnd, int value) {
        Random r = new Random();
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++) {
            if(rnd) {arr[i] = r.nextInt(10);}
            else arr[i] = i+value;
        }
        return arr;
    }
}
