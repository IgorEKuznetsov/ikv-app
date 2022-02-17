package com.lessons;

public class Cat extends Animal {
    //protected int distanceCat;
    public Cat(String name, int age, int RUN_MAX) {
        super(name, age, RUN_MAX, -1);
    }


    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public String swim(int distance) {
        return name + " can't swim";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat another = (Cat) o;
        return this.name.equals(another.name) && this.age == another.age && this.RUN_MAX == another.RUN_MAX;
    }



}
