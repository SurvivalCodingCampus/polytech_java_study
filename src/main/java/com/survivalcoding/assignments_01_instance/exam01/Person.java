package com.survivalcoding.assignments_01_instance.exam01;

public class Person {
    //이름과 태어난 해는 한 번 정해지면 수정이 불가
    private final String name;
    private final int birthYear;

    //이름과 태어난 해를 생성자로 받는다
    public Person(String name, int birthYear) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("이름은 3자 이상");
        }
        int currentYear = java.time.LocalDate.now().getYear();
        if (birthYear > currentYear) {
            throw new IllegalArgumentException("출생 연도는 현재 연도보다 클 수 없음");
        }
        this.name = name;
        this.birthYear = birthYear;
    }
    //getAge()메서드를 통해 나이를 제공하지만, 임의로 수정은 불가
    //나이 계산은 올해년도에서 birthYear 년도를 뺀 값을 리턴한다
        //현재 시간과 날짜는 Date 클래스를 활용하면 얻을 수 있다
public int getAge(){
        return java.time.LocalDate.now().getYear()-birthYear;
}
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
    }
}
