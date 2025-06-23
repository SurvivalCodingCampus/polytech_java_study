package com.survivalcoding.class_3;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getAge() {
        //Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(now);
        int age = calendar.get(Calendar.YEAR) - this.birthYear + 1;
        return age;
    }
}
