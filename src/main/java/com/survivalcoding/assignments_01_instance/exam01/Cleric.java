package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {

    String name;
    int hp;
    int mp;
    final int maxHp = 50;
    final int maxMp = 10;

    Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }
    void selfAid()
    {
        int manaCost =5;
        if(this.mp < manaCost) {
            System.out.println("Heal failed: Not enough mana");
            return;
        }
        this.mp -= manaCost;
        this.hp = maxHp;
    }

    int pray(int prayerDuration)
    {
        if(prayerDuration < 1)
        {
            return 0;
        }
        if(this.mp == maxMp)
        {
            return  0;
        }
        int max = 2;
        Random rand = new Random();
        int manaRecoveryAmount = prayerDuration + rand.nextInt(max+1);

        if(this.mp + manaRecoveryAmount > maxMp)
        {
            this.mp = maxMp;
        }
        else
        {
            this.mp += manaRecoveryAmount;
        }

        return this.mp;
    }
}
