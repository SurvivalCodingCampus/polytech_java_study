package com.survivalcoding;

import java.util.Random;

public class Cleric {
    // Random instance for PRNG generating
    private static final Random rng = new Random();

    //    Base Stats
    private String name;
    private int HP = 50;
    private final int maxHP = 50;
    private int MP = 10;
    private final int maxMP = 10;

    //    Getter
    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    //    Setter
    public void setHP(int hp) {
        if (hp > maxHP) {
            HP = maxHP;
            return;
        }
        HP = hp;
    }

    public void setMP(int mp) {
        if (mp > maxMP) {
            MP = maxMP;
            return;
        }
        MP = mp;
    }

    //    Heal self to max HP at cost of 5 MP
    public void selfAid() {
        // Aid self only if MP >= 5
        if (MP >= 5) {
            MP -= 5; // Mana used
            HP = maxHP; // Always fully aided
        }
    }

    // regenerate MP by specific amount.
    public int pray(int prayingTime) {
        // exception cases :: pray in negative time | MP is already at max.
        // return 0; (means cleric didn't pray.)
        if (prayingTime <= 0 || MP == maxMP) return 0;

        // MP which cleric got.
        int addedMP = prayingTime + rng.nextInt(3);

        // Pick smaller one; maxMP, only if your MP + addedMP is larger than maxMP.
        MP = Math.min(MP + addedMP, maxMP);

        // Show(return) how many MP cleric got.
        return addedMP;
    }
}
