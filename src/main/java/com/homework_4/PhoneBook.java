package com.homework_4;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    public static void main(String[] args) {
        getContact("Petrov");
        getContact("Ivanov");
    }

    public static void getContact(String name) {
        List<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact("Ivanov", 89177654598L));
        contactsList.add(new Contact("Petrov", 89174567711L));
        contactsList.add(new Contact("Sidorov", 89154876590L));
        contactsList.add(new Contact("Petrov", 81179876711L));

        for (Contact c : contactsList) {
            if (name.equals(c.getName())) {
                System.out.println(c);
            }
        }
    }


}



