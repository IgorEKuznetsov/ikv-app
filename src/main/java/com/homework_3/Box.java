package com.homework_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruit() {
        return fruits;
    }

    public double getWeightOption_one(double fruitWeight, ArrayList<T> fruits) {
        return fruits.size() * fruitWeight;
    }

    public float getWeightOption_two() {
        float result = 0;
        for (T fruit : fruits) {
            result += fruit.weight;
        }

        return result;
    }

    public boolean compare(Box<?> another) {
        return this.getWeightOption_two() == another.getWeightOption_two();
    }

    public void moveFruits(ArrayList<T> fruitsList, ArrayList<T> newFruitsList) {
        for (T fruit : fruitsList) {
            newFruitsList.add(fruit);
        }
        fruitsList.clear();
    }

    public void addFruits(Fruit fruit, ArrayList<T> fruitsList, int countOfFruits) {
        for (int i = 0; i < countOfFruits; i++) {
            fruitsList.add((T) fruit);
        }
    }
}
