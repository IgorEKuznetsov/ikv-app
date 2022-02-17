package com.lessons;

public class Dog extends Animal {
    public Dog (String name, int age, int RUN_MAX, int SWIM_MAX) {
        super(name, age, RUN_MAX, SWIM_MAX);
    }



    @Override
    public void voice() {
        System.out.println("Gaf-Gaf!!!!");
    }
}
