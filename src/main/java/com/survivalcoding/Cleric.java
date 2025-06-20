package com.survivalcoding;

import java.util.Random;

public class Cleric {
    static final int maxHp = 50;
    static final int maxMp = 10;

    String name;
    int hp;
    int mp;

    // 난수 생성을 위한 Random 객체 한번만 만들자
    Random rand = new Random();

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, Cleric.maxMp);
    }

    Cleric(String name) {
        this(name, Cleric.maxHp);
    }

    public void selfAid() {
        if (hp == maxHp) return; // 이미 max라면 return
        if (mp < 5) return;      // mp가 부족하면 return
        mp -= 5;
        hp = maxHp;
    }

    public int pray(int sec) {
        if (mp == maxMp) return 0; // 이미 max라면 return

        // 회복량 recoveryMp에 저장
        int recoveryMp = rand.nextInt(3) + sec; // 0~2 랜덤값 + 기도 시간(s)

        // maxMp 보다 더 회복하는가?
        if (recoveryMp + mp > maxMp) {
            recoveryMp = maxMp - mp;
        }

        // mp 회복
        mp += recoveryMp;
        return recoveryMp;
    }
}
