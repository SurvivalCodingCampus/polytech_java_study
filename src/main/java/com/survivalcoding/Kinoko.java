package com.survivalcoding;

public class Kinoko {
    int hp = 50;
    final int level = 10;

    void attack() {
        final int level = 20;
        hp = 100;
    }

    void setHp(int hp) {
        this.hp = hp;
        System.out.println("hp 를 회복");
    }
}
