package com.survivalcoding;

public class Kinoko {


    int hp;
    final int level = 10;

    void attack(){
        final int level =20;
        hp = 100;
    }

    void setHP(int hp){
        this.hp = hp;
        System.out.println("hp회복");
    }
}
