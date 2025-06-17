package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name = "Strong Cleric";
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    int currentHp = MAX_HP; // 초기 값으로 할당
    int currentMp = MAX_MP; // 초기 값으로 할당
    private static final Random rand = new Random();

    // 1. 이름 hp mp
    // 2. 이름 mp
    // 3. 이름
    Cleric(String name) {
        this.name = name;
        this.currentHp = MAX_HP;
        this.currentMp = MAX_MP;
    }

    Cleric(String name, int hp) {
        this(name);
        this.currentHp = hp;
    }

    Cleric(String name, int hp, int mp) {
        this(name, hp);
        this.currentMp = mp;
    }

    void selfAid() {
        if (currentMp < 5) {
            // 스킬 못 쓴다고 하기
            return;
        }

        this.currentMp -= 5;
        this.currentHp = MAX_HP;
    }

    int pray(int time) {
        if (time < 0) {
            // 잘못된 time 값
            return 0;
        }

        int randomUpMp = rand.nextInt(3) + time;
        int tempMp = this.currentMp;

        currentMp += randomUpMp;

        if (currentMp > MAX_MP) {
            currentMp = MAX_MP;
            return MAX_MP - tempMp;
        } else
            return randomUpMp;
    }
}
