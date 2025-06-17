package com.survivalcoding;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;

    public int getAge() {
        return LocalDate.now().getYear() - getBirthYear();
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person(String name, int birthYear) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (birthYear < 0 || birthYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Birth year must be between 0 and 2025");
        }

        this.name = name;
        this.birthYear = birthYear;
    }

}
