package com.survivalcoding.Game;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final int birthYear;

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - this.birthYear;
        return age;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }


}
