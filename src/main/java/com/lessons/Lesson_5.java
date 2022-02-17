package com.lessons;

public class Lesson_5 {
    public static void main(String[] args) {
       
        Person[] personArr = new Person[5];

        personArr[0] = new Person("Alex", "engineer", "test@ingtest.ru", 1909877, 250, 43);
        personArr[1] = new Person("Ivan", "tester", "test12@ingtest.ru", 1909323, 200, 18);
        personArr[2] = new Person("Govanni", "engineer", "abc@ingtest.ru", 1909877, 250, 41);
        personArr[3] = new Person("Max", "senior", "cbpcdt@ingtest.ru", 1909877, 250, 50);
        personArr[4] = new Person("Nicolai", "principal", "cc360@ingtest.ru", 1909877, 250, 35);


        for(Person p : personArr){
            if(p.getAge() > 40){
                System.out.println(p);
            }
        }
        System.out.println();

        Men men = new Men("Greek", "worker", "ree@134", 324324, 1000, 50);
        System.out.println(men); //toString from super class
        System.out.println(men.getAge()); //method get from super class

        System.out.println(men.setAge(3));

        System.out.println(men.getAge());

    }
}

