package com.survivalcoding;

import java.util.Random;

public class Cleric {
    String name;
    int currentHp;
    final int maxHp = 50;
    int currentMp;
    final int maxMp = 10;
    void selfAid(){
        this.currentMp -= 5;
        if(this.currentMp < 0)
            this.currentMp = 0;

        this.currentHp  = maxHp;
    }

}
