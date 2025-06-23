package com.survivalcoding;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private final String name;
    private final int birthYear;

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int currentYear = calendar.get(Calendar.YEAR);

        return (currentYear - birthYear + 1);
    }
}
