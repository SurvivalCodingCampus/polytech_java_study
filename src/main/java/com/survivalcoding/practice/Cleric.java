package com.survivalcoding.practice;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;

    public void selfAid(){
        mp -= 5;
        hp = maxHp;
    }
}
