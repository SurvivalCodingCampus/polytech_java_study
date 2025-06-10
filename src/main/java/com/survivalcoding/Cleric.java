package com.survivalcoding;

import java.util.Random;

public class Cleric {

    String name;
    int hp = 50;
    final int maxHP = 50;
    int mp = 10;
    final int maxMP = 10;

    void selfAid() {
        mp -= 5;
        hp = maxHP;
    }


    int pray(int sec) {

        Random rand = new Random();

        int point = rand.nextInt(3); //0,1,2
        int reMP = sec + point; //시간+랜덤 포인트(0~2)

        mp += reMP;

        if (mp > maxMP) {
            mp = maxMP;
        }

        return reMP;
    }
}




