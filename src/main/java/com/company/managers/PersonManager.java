package com.company.managers;

import com.company.model.Person;

public class PersonManager {
    private final Person person;

    public PersonManager(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void postInit() {
        System.out.println("User: " + person + " was created.");
    }

    public void preDestroy() {
        System.out.println("User: " + person + " was destroyed.");
    }
}
