package com.survivalcoding;

import java.util.Random;

public class Cleric {
    //1. 연습문제 01
    String name; // 이름

    int hp; // hp
    int mp; // mp

    final int maxhp = 50; // 최대 hp
    final int maxmp = 10; //최대 mp


    Random rd = new Random();



    public Cleric(String name){// 안적어도 됨
        this.name = name;
        this.hp = maxhp;
        this.mp = maxmp;
    }

    //2. 연습문제 02
    void selfAid(){ // 메소드는 인수와 리턴값이 없다.
        //mp를 5 소비하는 것으로 자신의 hp를 최대 hp까지 회복할 수 있다.
         this.mp -= 5;
         this.hp = this.maxhp;
    }

    //3. 연습문제 03 // 자신의 mp 회복
    int pray(int time){ // 인수에 "기도할 시간(초)"를 지정할 수 있고, 리턴 값은 "실제 회복된 mp양"을 반환
        //회복량은 기도한 시간(초)에 랜덤하게 0-2 포인트의 보정을 한 양이다.
        // 단, 최대 mp보다 더 회복은 불가
        int rdIntRange = rd.nextInt(3); //0-2까지의 랜덤 수 리턴;
        this.mp = time + rdIntRange;

        if(this.mp > this.maxmp) {
            this.mp = this.maxmp;
        }
        return this.mp;
    }

}
