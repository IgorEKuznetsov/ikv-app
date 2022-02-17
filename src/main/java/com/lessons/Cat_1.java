package com.lessons;

public class Cat_1 {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat_1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\n" + "Appetite: " + appetite +
                "\n" + "isFull: " + isFull;
    }

    public void eat(Plate plate) {
        if (plate.food - appetite >= 0) {
            plate.decreaseFood(appetite);
            appetite = 0;
            isFull = true;
        }


    }
}

