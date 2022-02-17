package com.lessons;

public class Home_work_6 {

    private static int counter;

    public static void main(String[] args) {

        Dog dog1 = new Dog("dog", 3, 10, 10);
        Cat cat1 = new Cat("cat", 3, 3);
        System.out.println(test(dog1));
        System.out.println(test(cat1));
        System.out.println();


        Ianimal[] ianimals = {
                new Cat("Murz", 3, 200),
                new Dog("Barbos", 5, 500, 10),
                new Cat("Bars", 3, 100),
                new Dog("Muhtar", 5, 300, 10)
        };
        for (Ianimal animal : ianimals) {
            System.out.println(animal);
            System.out.println(animal.run(550));
            System.out.println(animal.swim(11));
            System.out.println(animal.run(24));
            System.out.println(animal.swim(7));
        }

        System.out.println("Animals count: " + ianimals.length);
        System.out.println("Animals count: " + Animal.getCountOfAnimals()); //via static field


    }


    static String test(Ianimal ianimal) {
        return ianimal.run(10);
    }


}

