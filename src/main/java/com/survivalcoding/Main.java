package com.survivalcoding;

import com.survivalcoding.assignments_01_instance.exam01.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person p = new Person("손민석", 2001);
        System.out.println(p.getName());      // 손민석
        System.out.println(p.getBirthYear()); // 2001
        System.out.println(p.getAge());       // (예: 2025년 기준 25)
        System.out.println(p);                // 손민석 (2001년생, 나이: 25세)
    }
}