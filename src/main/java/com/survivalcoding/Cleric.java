package com.survivalcoding;

import java.util.Random;

public class Cleric {
    final String name = "Cleric";
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    void selfAid(){
        if (this.mp < 5) return;
        this.mp -= 5;
        this.hp = maxHp;
    }
//1초 0~2 3초 3~5 <<  초당 1씩 증가 및 기도 시간별로 0 ~ i 값으로 랜덤 상수 부여 nextInt= 0 ~ i+1까지임 << 실제 return값은 MP에 몇을 증가 시킬것이냐
    int pray(int i){


        Random rand = new Random();
        int randomNum = rand.nextInt(i+1);

        int recoveredMp = i + randomNum;

        if (recoveredMp+ this.mp > 10){
            recoveredMp = this.maxMp - this.mp;
        }

        this.mp += recoveredMp;

        return recoveredMp;
    }

}
