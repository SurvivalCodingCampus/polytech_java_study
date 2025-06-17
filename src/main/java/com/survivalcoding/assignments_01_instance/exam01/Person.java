package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Calendar;

public class Person {
    private final String name;
    private final int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 1995);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
