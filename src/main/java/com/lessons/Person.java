package com.lessons;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, int phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone_number;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person: " + name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }
}
