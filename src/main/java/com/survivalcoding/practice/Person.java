package com.survivalcoding.practice;
import java.time.Year;

public class Person {
    private final String name;
    private final int birthYear;
    private int age;

    // 생성자
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        age = Year.now().getValue() - birthYear;
        // Year.now() → 현재 연도 정보 (Year 타입 객체)
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        throw new IllegalArgumentException("이름을 수정할 수 없습니다");
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        throw new IllegalArgumentException("태어난 해는 수정할 수 없습니다");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        throw new IllegalArgumentException("나이는 수정할 수 없습니다");
    }
}
