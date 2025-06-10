package com.survivalcoding.practice;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;

    public void selfAid(){
        if(mp < 5) return;
        mp -= 5;
        hp = maxHp;
    }

    public int pray(int sec){
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        // 회복량 recoveryMp에 저장
        int recoveryMp = rand.nextInt(3) + sec; // 0~2 랜덤값 + 기도 시간(s)

        // maxMp 보다 더 회복하는가?
        if(recoveryMp + mp > maxMp){
            recoveryMp = maxMp - mp;
        }

        // mp 회복
        mp += recoveryMp;
        return recoveryMp;
    }
}
