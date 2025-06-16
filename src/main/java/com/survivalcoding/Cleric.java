package com.survivalcoding;
import java.util.Random;
import java.lang.Math;

public class Cleric {
    String name = "A";
    int hp, mp;

    // final = 자바 클래스 필드의 상수화
    static final int maxHp = 50;
    static final int maxMp = 10;

    // 기도한 시간 + 랜덤 포인트만큼 mp회복
    Random random = new Random();

    Cleric() {
        this.hp = 50;
        this.mp = 10;
    }

    // 이름을 받으면 hp와 mp가 가득차게
    Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    // mp 소모로 hp 회복
    void selfAid() {
        if(this.mp < 5) {
            return;
        }

        this.mp -= 5;
        this.hp = maxHp;    // 체력이 이미 가득 차있으면 마나 소모만 됨
    }

    // mp는 기도한 시간당 1만큼 + 추가 랜덤 포인트로 회복
    public int pray(int timePray) {
        if((timePray <= 0) || (this.mp == maxMp)) {
            return 0;
        }

        int randomPoint = random.nextInt(3);
        int recovery = timePray + randomPoint;
        int finalRecovery = Math.min(recovery, maxMp - this.mp);
        this.mp += finalRecovery;

        return finalRecovery;
    }
}
