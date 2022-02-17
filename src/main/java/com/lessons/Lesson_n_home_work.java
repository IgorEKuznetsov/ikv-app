/**
 *  Java 1. Homework n
 *
 * @autor Igor Kuznetsov
 * @version 23.01.2022
 */
package com.lessons;
import java.util.Arrays; //static   Import of CLASSES!
import java.util.Random; //noStatic. We need create new object for invocation.

public class Lesson_n_home_work {
    public static void main(String[] args) {

        //int[] arr = new int[5];
        int[] arr = {1, 34, 34, 7};
        System.out.println(Arrays.toString(arr));
       // for (int i =0; i< arr.length; i++){
      //  for (int elementOfArr : arr) {
        //    System.out.print(elementOfArr);

           Random random = new Random(); //create reference var type - random
           for(int i = 0; i < 11; i++){
               System.out.print(random.nextInt(10) + " ");
           }
        }


        //System.out.println(isBetween10And20(10, 2));
       // printPositiveOrNegative(-1);
       // repeatString("test", 7);
   // }

    static boolean isBetween10And20 (int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    static void printPositiveOrNegative (int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    static void repeatString (String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }


}

