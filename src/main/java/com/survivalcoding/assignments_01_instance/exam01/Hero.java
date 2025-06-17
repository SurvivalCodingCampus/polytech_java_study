package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Hero {
    static int money = 100; //공공자원
    String name;
    int hp;
    Sword sword;

    Hero() {
        this.hp = 100;
        this.name = "김영웅";
    }

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    static void setRandomMoney() {
        money = new Random().nextInt(1000);
    }


}
