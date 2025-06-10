package com.survivalcoding.assignments_01_instance.exam01;

public class Kinoko {
    int hp = 50;
    final int level = 10;

    void attack() {
        final int level = 20;
        hp = 100;
    }
    void setHP(int hp) {
    this.hp = hp;
    System.out.println("hp를 회복");
    }
}