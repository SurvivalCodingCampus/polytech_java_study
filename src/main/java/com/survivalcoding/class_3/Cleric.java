package com.survivalcoding.class_3;
//난수 생성
import java.util.Random;

/******************************************
* 수정일 : 250616
* 수정사항
 * 1 : MAX_HP, MAX_MP 상수에 대해 static 선언
 * 2 : 생성자 함수 추가
******************************************/
public class Cleric {
    static final int MAX_HP =50;
    static final int MAX_MP=10;

    String name;
    int hp;
    int mp;

    Cleric(String name){
        this(name,MAX_HP,MAX_MP);
    }
    Cleric(String name, int hp){
        this(name,hp,MAX_MP);
    }
    Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp= mp;
    }

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
