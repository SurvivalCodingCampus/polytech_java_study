package com.survivalcoding.assignments_01_instance.exam01;

import java.time.LocalDateTime;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int year) {
        this.name = name;
        this.birthYear = year;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDateTime.now().getYear() - this.birthYear;
    }

}
