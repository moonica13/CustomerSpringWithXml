package com.company.model;

import java.util.Date;

public class Person {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Date birthDate;

    public Person(int id, String firstName, String lastName, int age, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }
}
