package com.survivalcoding.practice;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    static final int maxHp = 50;
    static final int maxMp = 10;

    // 난수 생성을 위한 Random 객체 한번만 만들자
    Random rand = new Random();

    public void selfAid(){
        if(hp == maxHp) return; // 이미 max라면 return
        if(mp < 5) return;      // mp가 부족하면 return
        mp -= 5;
        hp = maxHp;
    }

    public int pray(int sec){
        if(mp == maxMp) return 0; // 이미 max라면 return

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

    // test를 위해 setMp(), setHp() 추가
    public void setHp(int hp){
        if(hp < 0 || hp >= maxHp) return;
        this.hp = hp;
    }
    public void setMp(int mp){
        if(mp < 0 || mp >= maxMp) return;
        this.mp = mp;
    }
}
