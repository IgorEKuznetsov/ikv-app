/**
 * Java Core. Homework 3
 *
 * @autor Igor Kuznetsov
 * @version 11.03.2022
 */
package com.homework_3;

import java.util.ArrayList;


public class Main {
    private static final double APPLE_WEIGHT = 1.0;
    private static final double ORANGE_WEIGHT = 1.5;

    public static void main(String[] args) {
        ArrayList<Orange> orangeArrayList = new ArrayList<>();  //список для хранения апельсинов
        Box<Orange> orangeBox = new Box<>(orangeArrayList); //коробка с апельсинами
        orangeBox.addFruits(new Orange(), orangeArrayList, 2);

        ArrayList<Apple> appleArrayList = new ArrayList<>();  //список для хранения яблок
        Box<Apple> appleBox = new Box<>(appleArrayList);  //коробка с ябоками
        appleBox.addFruits(new Apple(), appleArrayList, 3);

        System.out.println(orangeBox.getFruit());
        System.out.println(appleBox.getFruit());

        /*
        Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество
         */
        System.out.println(appleBox.getWeightOption_one(APPLE_WEIGHT, appleArrayList));
        System.out.println(orangeBox.getWeightOption_one(ORANGE_WEIGHT, orangeArrayList));

        /*
        Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
         */

        System.out.println(appleBox.compare(orangeBox));

        /*
        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
         */

        ArrayList<Apple> newAppleList = new ArrayList<>();
        appleBox.moveFruits(appleArrayList, newAppleList);
        System.out.println(appleArrayList);
        System.out.println(newAppleList);
        Box<Apple> anotherAppleBox = new Box<>(newAppleList);

          /*
          Метод добавления фрукта в коробку.
         */

        appleBox.addFruits(new Apple(), appleArrayList, 10);
        System.out.println(appleArrayList);

        System.out.println(appleBox.compare(orangeBox));
    }
}
