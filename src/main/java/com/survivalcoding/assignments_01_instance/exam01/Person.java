package com.survivalcoding.assignments_01_instance.exam01;

import java.time.LocalDate;

public class Person {
    private final String name;
    private int age;
    private final int birthyear;

    public Person(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        age = year - birthyear;
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
    }
}
