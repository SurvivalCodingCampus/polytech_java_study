package com.survivalcoding;

import java.util.Calendar;

public class Person {
    private final String name;
    private final int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        return year - birthYear;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
}