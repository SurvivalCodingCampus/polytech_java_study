package com.survivalcoding;

public class Cleric {
    final String name = "Cleric";
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    void SelfAid(){
        this.mp -= 5;
        this.hp = maxHp;
    }

    //void pray()

}
