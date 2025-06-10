package com.survivalcoding;

import java.util.Random;

public class Cleric {
    //    Base Stats
    String name;
    int HP = 50;
    final int maxHP = 50;
    int MP = 10;
    final int maxMP = 10;

    //    Heal self to max HP at cost of 5 MP
    public void selfAid() {
        if (MP >= 5) {
            MP -= 5;
            HP = maxHP;
        }
    }

    // regenerate MP by specific amount.
    public int pray(int prayingTime) {
        Random rng = new Random();
        int addedMP = MP + prayingTime + rng.nextInt(3);

    // intellisense says "Can be replaced with Math.min() call."
    // return Math.min(addedMP, maxMP);
        return addedMP > maxMP ? maxMP : addedMP;
    }
}
