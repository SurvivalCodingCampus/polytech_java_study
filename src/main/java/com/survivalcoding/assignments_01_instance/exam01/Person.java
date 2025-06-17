package com.survivalcoding.assignments_01_instance.exam01;

public class Person {
    private String name;
    private int age;

    //이름과 태어난 해를 생성자로 받는다
    //이름과 태어난 해는 한 번 정해지면 수정이 불가
    //getAge()메서드를 통해 나이를 제공하지만, 임의로 수정은 불가
    //나이 계산은 올해년도에서 birthYear 년도를 뺀 값을 리턴한다
        //현재 시간과 날짜는 Date 클래스를 활용하면 얻을 수 있다
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
    }
}
