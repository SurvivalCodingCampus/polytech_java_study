package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    final int maxHp = 50;
    final int maxMp = 10;
    int currentHp = maxHp; // 초기 값으로 할당
    int currentMp = maxMp; // 초기 값으로 할당

    void selfAid(){
        if(currentMp < 5){
            // 스킬 못 쓴다고 하기
            return;
        }

        this.currentMp -= 5;
        this.currentHp  = maxHp;
    }

    int pray(int time){
        if(time < 0) {
            // 잘못된 time 값
            return 0;
        }

        Random rand = new Random();
        int randomUpMp = rand.nextInt(3) + time;
        int tempMp = this.currentMp;

        currentMp += randomUpMp;

        if(currentMp > maxMp){
            currentMp = maxMp;
            return maxMp - tempMp;
        }
        else
            return randomUpMp;
    }
}
