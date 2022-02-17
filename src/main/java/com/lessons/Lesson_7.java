package com.lessons;

import java.time.Duration;

public class Lesson_7 {
    public static void main(String[] args) {
       Plate plate = new Plate(100);
       Cat_1 cat_1 = new Cat_1("Bars", 50);
       Cat_1 cat_2 = new Cat_1("Murz", 30);
       Cat_1 cat_3 = new Cat_1("Ferz", 30);

       Cat_1[] cats = {cat_1, cat_2, cat_3};

       for (Cat_1 cat : cats){
           cat.eat(plate);
           System.out.println(cat);
       }
        System.out.println(plate);



    }
}
