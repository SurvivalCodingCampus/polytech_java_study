package com.survivalcoding;

import java.util.Random;

public class Cleric {
    // Random instance for PRNG generating
    private static final Random rng = new Random();

    //    Base Stats
    private String name;
    private int HP = 20;
    private final int maxHP = 50;
    private int MP = 5;
    private final int maxMP = 10;

    //    Getter
    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    //    Heal self to max HP at cost of 5 MP
    public void selfAid() {
        if (MP >= 5) {
            MP -= 5;
            HP = maxHP;
        }
    }

    // regenerate MP by specific amount.
    public int pray(int prayingTime) {
//        Coderabbitai said, "Inefficient way." ---> Random rng = new Random();
        int addedMP = MP + prayingTime + rng.nextInt(3);

        // intellisense says "Can be replaced with Math.min() call."
        // Not recommended :: return addedMP > maxMP ? maxMP : addedMP;
        return Math.min(addedMP, maxMP); // <- Looks more obvious

    }
}
