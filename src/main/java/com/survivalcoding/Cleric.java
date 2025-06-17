package com.survivalcoding;

import java.util.Random;

public class Cleric {
    //1. 연습문제 01
    String name; // 이름
    int hp; // hp
    int mp; // mp
    // 06.16) 연습문제 01 > 공유자원으로 변경
    static final int maxHp = 50; // 최대 hp
    static final int maxMp = 10; //최대 mp

    Random random = new Random(); // rd > random 으로 수정

    // (A) 문제 작성
    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // (B) 문제 작성
    public Cleric(String name, int hp) {
        this("아서스", hp, maxMp);
    }

    // (C) 문제 작성
    public Cleric(String name) {// 안적어도
        this("아서스", maxHp, maxMp);
    }

    //2. 연습문제 02 > mp 검증 부족 [음수 가능성 없애기]> 수정
    void selfAid() { // 메소드는 인수와 리턴값이 없다.
        //mp를 5 소비하는 것으로 자신의 hp를 최대 hp까지 회복할 수 있다.
        if (this.mp < 5) {
            System.out.println("MP가 부족합니다.");
            return;
        }
        this.mp -= 5;
        this.hp = Cleric.maxHp;
    }

    //3. 연습문제 03 // 자신의 mp 회복
    int pray(int time) { // 인수에 "기도할 시간(초)"를 지정할 수 있고, 리턴 값은 "실제 회복된 mp양"을 반환
        //회복량은 기도한 시간(초)에 랜덤하게 0-2 포인트의 보정을 한 양이다.
        // 단, 최대 mp보다 더 회복은 불가
        int rdIntRange = random.nextInt(3); //0-2까지의 랜덤 수 리턴;
        this.mp += time + rdIntRange;

        if (this.mp > Cleric.maxMp) {
            this.mp = Cleric.maxMp;
        }
        return this.mp;
    }

}
