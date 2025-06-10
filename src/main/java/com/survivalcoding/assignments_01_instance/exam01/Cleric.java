package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {

    String name;
    public int hp;
    public int mp;
    public final int maxHp = 50;
    public final int maxMp = 10;


    public Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }
    public void selfAid()
    {
        int manaCost =5;
        this.mp -=manaCost;
        this.hp = this.maxHp;
    }


}
