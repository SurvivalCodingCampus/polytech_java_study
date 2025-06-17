package com.survivalcoding.assignments_01_instance.exam01;
import java.util.Date;

public class Person {
    private final String name;       // final: 수정 불가능
    private final int birthYear;

    // 생성자
    public Person(String name, int birthYear) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("이름은 null일 수 없고 2자 이상이어야 합니다.");
        }
        if (birthYear < 1900 || birthYear > getCurrentYear()) {
            throw new IllegalArgumentException("태어난 해는 1900년 이상, 현재 연도 이하이어야 합니다.");
        }

        this.name = name;
        this.birthYear = birthYear;
    }

    // Getter: 이름은 읽을 수만 있고 수정 불가
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // 나이 계산 (현재 연도 - 태어난 해)
    public int getAge() {
        return getCurrentYear() - birthYear;
    }

    // 현재 연도 계산
    private int getCurrentYear() {
        Date now = new Date();
        return now.getYear() + 1900; // Date.getYear()는 1900년부터의 연도
    }

    // Optional: 문자열로 표현
    @Override
    public String toString() {
        return name + " (" + birthYear + "년생, 나이: " + getAge() + "세)";
    }
}
