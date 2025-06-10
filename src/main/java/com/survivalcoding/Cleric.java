package com.survivalcoding;

public class Cleric {

    String name;
    int hp=50;
    final int maxHP=50;
    int mp=10;
    final int maxMP=10;

    void selfAid(){
        this.mp -=5;
        this.hp = maxHP;
    }
}
