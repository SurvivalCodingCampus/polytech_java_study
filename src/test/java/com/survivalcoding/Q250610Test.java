package com.survivalcoding;

import com.survivalcoding.assignments_01_instance.exam01.Cleric;

public class Q250610Test {
    public static void main(String[] args) {
        // Cleric 객체 생성
        Cleric cleric = new Cleric("Cleric");

        // 값 출력
        System.out.println("Name: " + cleric.name);
        System.out.println("HP: " + cleric.HP);
        System.out.println("MP: " + cleric.MP);
    }
}