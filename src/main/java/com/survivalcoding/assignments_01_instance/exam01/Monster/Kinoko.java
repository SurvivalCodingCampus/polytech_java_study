package com.survivalcoding.assignments_01_instance.exam01.Monster;

public class Kinoko {
    int hp = 50;
    final int level = 10;

    public void attack() {
        final int level = 20;
        hp = 100;
    }
    void setHP(int hp) {
    this.hp = hp;
    System.out.println("hp를 회복");
    }

    public void setHp(int hp) {
        this.hp=hp;
        System.out.println("hp를 회복");
    }
}