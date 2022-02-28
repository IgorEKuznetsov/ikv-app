package com.homework_4;

public class Contact {
    protected String name;
    protected long number;

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + ": " + number;
    }

    public String getName() {
        return name;
    }

}
