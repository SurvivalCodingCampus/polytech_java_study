package com.survivalcoding;

import java.util.Random;

public class Cleric {

    String name;
    int hp ;
    static int maxHP = 50;
    int mp ;
    static int maxMP = 10;

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


    Cleric(String name, int hp, int mp){

        this.name = name;
        this.hp = hp;
        this.mp = mp;

    }

    Cleric(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.mp = maxMP;
    }

    Cleric(String name){
        this.name = name;
        this.hp = maxHP;
        this.mp = maxMP;
    }

}




