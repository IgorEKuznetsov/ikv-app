package com.lessons;

public class Equals {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars", 3, 1);
        Cat cat2 = new Cat("Bars", 3, 3);
        System.out.println(cat1.equals(cat2));
    }



}
