package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Calendar;

public class Person {
    private final String name;
    private final int birthYear;
    private final Calendar today = Calendar.getInstance();

    public Person(String name, int birtYear) {
        this.name = name;
        this.birthYear = birtYear;
    }

    private int getAge()
    {
        int year = today.get(Calendar.YEAR);
        int age = year - birthYear;

        return age;  //나이 계산은 올해 년도 에서 birthYear 년도를 뺀 값을 리턴 한다.
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void ageTest()
    {
        System.out.println(name);
        System.out.println(birthYear);

    }

}
