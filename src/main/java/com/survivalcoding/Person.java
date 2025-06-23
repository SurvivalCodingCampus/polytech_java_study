package com.survivalcoding;

import java.util.Date;

public class Person {
    final private String name;
    final private int birthYear;

    public Person(String name, int birthYear) {
        if (name == null) throw new IllegalArgumentException("You must put a name");
        if (birthYear > new Date().getYear() + 1900)
            throw new IllegalArgumentException("You cannot? birth from the future in the present time");
        this.name = name;
        this.birthYear = birthYear;
    }

    // Class Date's "getYear()" is deprecated.
    // Did you know getYear() return the year - 1900?
    // It's a traditional reason. Go google it out.
    public int getAge() {
        return new Date().getYear() + 1900 - this.birthYear;
    }
}
