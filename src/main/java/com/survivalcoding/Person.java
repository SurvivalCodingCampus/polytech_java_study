package com.survivalcoding;

import java.util.Calendar;

public class Person {
    private final String name;
    private final int birthYear;
    Calendar cal = Calendar.getInstance();

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;

    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        int yy = cal.get(Calendar.YEAR);
        return yy - birthYear;
    }


}