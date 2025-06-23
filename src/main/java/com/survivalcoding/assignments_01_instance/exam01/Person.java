package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Date;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public int getAge(){
       Date date = new Date();
       int currentYear = date.getYear() + 1900;
                return currentYear - birthYear;
    }

}
