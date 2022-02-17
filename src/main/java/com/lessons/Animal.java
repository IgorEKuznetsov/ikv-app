package com.lessons;

import java.util.Objects;

public abstract class Animal implements Ianimal {
    protected String name;
    protected int age;
    protected int RUN_MAX;
    protected int SWIM_MAX;
    protected String className;
    protected static int countOfAnimals = 0;

    public Animal(String name, int age, int RUN_MAX, int SWIM_MAX) {
        this.name = name;
        this.age = age;
        this.RUN_MAX = RUN_MAX;
        this.SWIM_MAX = SWIM_MAX;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String toString() {
        return className + " " + name + ", " + age + ", " + RUN_MAX + ", " + SWIM_MAX;
    }

    public void voice() {
        System.out.println("Unknown voice!");
    }

    @Override
    public String run(int distance) {
        if (distance <= RUN_MAX) {
            return className + name + ", Run distance is " + distance;
        }
        return className + name + " can't run " + distance + ". Run max is " + RUN_MAX;
    }

    @Override
    public String swim(int distance) {
        if (distance <= SWIM_MAX) {
            return className + name + ", Swim distance is " + distance;
        }
        return className + name + " can't swim, distance is more than " + SWIM_MAX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && RUN_MAX == animal.RUN_MAX && SWIM_MAX == animal.SWIM_MAX && Objects.equals(name, animal.name) && Objects.equals(className, animal.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, RUN_MAX, SWIM_MAX, className);
    }
}
