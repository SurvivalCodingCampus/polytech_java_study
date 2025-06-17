package com.survivalcoding;

import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private final int birthYear; // 상수화

    // NAME 관련 get, set
    public String getName() {
        return name; // 외부에서 Hero.name 메소드를 알 수 있게 해줌
    }

    public void setName(String name) {
        this.name = name; // 새로운 값을 변경 가능하게 해줌
    }

    Person(String name, int birthYear) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 합니다.");
        }
        this.name = getName();
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }


    public int getAge() {
        Date now = new Date();// 현재 날짜와 시간
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int currentYear = cal.get(Calendar.YEAR); // Calender에서 연도 추출

        return (currentYear - birthYear + 1);
    }
}
