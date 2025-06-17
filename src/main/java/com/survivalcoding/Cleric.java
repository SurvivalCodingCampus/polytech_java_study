package com.survivalcoding;
import java.util.Random;
import java.lang.Math;

public class Cleric {
    private String name = "A";
    private int hp;
    private int mp;

    // final = 자바 클래스 필드의 상수화
    static final int maxHp = 50;
    static final int maxMp = 10;

    // 기도한 시간 + 랜덤 포인트만큼 mp회복
    Random random = new Random();

    Cleric(String name) {
        this(name, Cleric.maxHp, Cleric.maxMp);
    }

    Cleric(String name, int hp) {
        this(name, hp, Cleric.maxMp);
    }

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
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
        this.hp = Cleric.maxHp;    // 체력이 이미 가득 차있으면 마나 소모만 됨
    }

    // mp는 기도한 시간당 1만큼 + 추가 랜덤 포인트로 회복
    public int pray(int timePray) {
        if((timePray <= 0) || (this.mp == Cleric.maxMp)) {
            return 0;
        }

        int randomPoint = random.nextInt(3);
        int recovery = timePray + randomPoint;
        int finalRecovery = Math.min(recovery, Cleric.maxMp - this.mp);
        this.mp += finalRecovery;

        return finalRecovery;
    }
}
