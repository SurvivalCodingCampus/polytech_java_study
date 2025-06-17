package com.survivalcoding.assignments_01_instance.exam01;

import java.time.LocalDateTime;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int year) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        this.name = name;
        this.birthYear = year;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return LocalDateTime.now().getYear() - this.birthYear;
    }

}
