package com.luxoft.automation;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); // 6
        System.out.println(sum(1, 2, 3, 4, 5)); // 15
    }
    public static String sum(int... a) {
        int result = 0;
        System.out.println("Значений: " + a.length);
        for (int b: a) {
            result += b;
        }
        return ("сумма = "+ result);
    }
}
