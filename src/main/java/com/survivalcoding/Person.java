package com.survivalcoding;

import java.util.Calendar;

public class Person {
    // 수정 불가 이름과 태어난 해
    private String name;
    private int birthYear;


    // 생성자 만들기
    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //3 번 임의 수정 불가로 파이널
    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        return 2025 - birthYear;
    }
}
