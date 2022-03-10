package com.homework_3;

public class Fruit {
    public final double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName();
    }
}
