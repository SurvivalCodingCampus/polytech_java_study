package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric { //용사
    //연습문제1
    public static final int max_hp = 50;
    public static final int max_mp = 10;

    String name;                 //이름
    int hp;                      //HP
    int mp;                      //MP
    final Random rand = new Random();

    void selfAid() {
        if (mp >= 5 && hp < max_hp) { // HP가 최대가 아닐 때만 실행
            mp -= 5;
            hp = max_hp;
        } else if (mp >= 5 && hp == max_hp) { // HP가 최대가 아닐 때만 실행
            mp -= 5;
        }

    }

    int pray(int sec) {
        if (sec <= 0 || mp == max_mp) {
            return 0;
        } else {
            int recover = sec + rand.nextInt(3); // 단일 보정값(0~2) 추가  sec = 10 -> recover = 10~12

            int actualRecover = Math.min(recover, max_mp - mp);

            mp += actualRecover;
            return actualRecover;
        }


    }


    // 이름, HP, MP 를 지정
    Cleric(String name, int hp, int mp) {
        this.hp = hp;
        this.name = name;
        this.mp = mp;
    }

    //이름과 HP만 지정, MP는 최대 MP와 같은 값이 초기화
    Cleric(String name, int hp) {
        /*this.name = name;
        this.hp = hp;
        this.mp = max_mp;*/
        this(name, hp, Cleric.max_mp);
    }

    //이름만 지정, HP 와 MP 는 최대 HP와 최대 MP로 초기화
    Cleric(String name) {
        /*this.name = name;
        this.mp = max_mp;
        this.hp = max_hp;*/
        this(name, Cleric.max_hp, Cleric.max_mp);
    }

}
