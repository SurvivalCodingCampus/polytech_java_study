package com.survivalcoding.practice;

public class Sword {
    String name;
    int damage;

    Sword() {
        this("소드 이름");
    }

    Sword(String name) {
        this.name = name;
        damage = 10;
    }
}