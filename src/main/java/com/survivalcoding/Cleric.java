package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    int currentHp;
    final int maxHp = 50;
    int currentMp;
    final int maxMp = 10;
    void selfAid(){
        if(currentMp < 5){
            // 스킬 못 쓴다고 하기
            return;
        }

        this.currentMp -= 5;
        this.currentHp  = maxHp;
    }

}
