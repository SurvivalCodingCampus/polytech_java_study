package com.survivalcoding;

public class Person {
    static int birthYear;
    static String name;

    Person (String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    private int Age(int birthYear)
    {
        int age;

        age = 2025 - birthYear;

        return age;
    }

    public void getAge(int birthYear)
    {
        int age;
        age = Age(birthYear);
    }
}
