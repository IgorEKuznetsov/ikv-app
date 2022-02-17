package com.lessons;

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;

    }
    public void decreaseFood(int food){
       this.food -= food;
    }
}
