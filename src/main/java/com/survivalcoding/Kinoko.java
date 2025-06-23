package com.survivalcoding;

public class Kinoko {
    int hp;
    final int LEVEL = 10;

    public int getHp() {
        return hp;
    }

    void attack() {
        final int level = 20;
        hp = 100;
    }
    void setHp(int hp){
        this.hp = hp;
        System.out.println("hp 회복");
    }
}
