package com.survivalcoding;

public class Cleric {
    String name;
    int hp = 10, mp = 10;

    // final = 자바 클래스 필드의 상수화
    final int maxHp = 50;
    final int maxMp = 50;

    void selfAid() {
        this.mp -= 5;
        this.hp = maxHp;
    }
}
