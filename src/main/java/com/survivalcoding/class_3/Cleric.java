package com.survivalcoding.class_3;
//난수 생성
import java.util.Random;

public class Cleric {
    final int MAX_HP =50;
    final int MAX_MP=10;

    String name;
    int hp = MAX_HP;
    int mp= MAX_MP;

    public void selfAid(){
        this.mp -= 5;
        this.hp = MAX_HP;
    }
    public int pray(int s){
        Random random = new Random();
        //0-2까지의 랜덤 상수 생성
        int r = random.nextInt(3);

        if((mp+r+s)>=MAX_MP) {
            int recovered = MAX_MP - mp;
            this.mp = MAX_MP;
            return recovered;
        }
        this.mp += r+s;
        return r+s;
    }
}
