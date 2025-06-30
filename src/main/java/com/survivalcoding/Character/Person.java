package com.survivalcoding.Character;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
}
