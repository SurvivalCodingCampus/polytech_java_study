package com.survivalcoding;

import java.util.Random;

public class Cleric {
    // Random instance for PRNG generating
    private static final Random random = new Random();

    //    Base Stats
    private String name;
    private int hp;
    private static final int maxHP = 50;
    private int mp;
    private static final int maxMP = 10;

    public Cleric(String name) {
        this(name, maxHP, maxMP);
    }

    public Cleric(String name, int hp) {
        this(name, hp, maxMP);
    }

    //    Constructors
    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    //    Getter
    public int getHP() {
        return hp;
    }

    public int getMP() {
        return mp;
    }

    //    Setter
    public void setHP(int hp) {
        if (hp > maxHP) {
            this.hp = maxHP;
            return;
        }
        if (hp < 0) {
            this.hp = 0;
            return;
        }

        this.hp = hp;
    }

    public void setMP(int mp) {
        if (mp > maxMP) {
            this.mp = maxMP;
            return;
        }
        if (mp < 0) {
            this.mp = 0;
            return;
        }
        this.mp = mp;
    }

    //    Heal self to max HP at cost of 5 MP
    //    Aid self only if MP >= 5
    //    Always fully aided
    public void selfAid() {
        if (this.mp >= 5) {
            this.mp -= 5;
            this.hp = maxHP;
        }
    }

    // regenerate MP by specific amount.
    // return: actual amount MP restored.
    // exception cases :: pray in zero second or negative time | MP is already at max.
    public int pray(int prayingTime) {
        int previousMP = this.mp;
        if (prayingTime <= 0 || this.mp == maxMP) return 0;

        // MP which cleric got.
        int addedMP = prayingTime + random.nextInt(3);

        this.mp = Math.min(this.mp + addedMP, maxMP);

        return this.mp - previousMP;
    }
}
