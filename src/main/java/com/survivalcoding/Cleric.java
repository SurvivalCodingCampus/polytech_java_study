package com.survivalcoding;

import java.util.Random;

public class Cleric {
    final String name = "Cleric";
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    void SelfAid(){
        this.mp -= 5;
        this.hp = maxHp;
    }
//1초 0~2 3초 3~5 <<  초당 1씩 증가 및 기도 시간별로 0 ~ i 값으로 랜덤 상수 부여 nextInt= 0 ~ i+1까지임
    int Pray(int i){


        Random rand = new Random();
        int randomNum = rand.nextInt(i+1);

        int recoveredMp = i + randomNum;

        if (recoveredMp >= maxMp) {
            recoveredMp = maxMp;
        }

        return recoveredMp;
    }

}
