package com.survivalcoding;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Person {

    private final String name;
    private final int birthyear;
    private int age;
    private Calendar calendar = Calendar.getInstance();


    Person(String name, int birthyear) {
        this.name = name;
        this.birthyear = birthyear;
    }

    public String getName() {
        return name;
    }

    public int getBirthyear() {
        return birthyear;
    }


  private int getAge() {
        age = birthyear - calendar.get(Calendar.YEAR);
        return age;
    }

   public void setAge(int age) {
        this.age = age;
    }
}
