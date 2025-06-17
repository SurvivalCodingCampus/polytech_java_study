package com.survivalcoding;

import java.util.Random;

public class Cleric extends Character {
    static final int maxHp = 50;
    static final int maxMp = 10;

    String name;
    int hp;
    int mp;

    Cleric(String name, int HP, int MP) {
        this.name = name;
        this.hp = HP;
        this.mp = MP;
    }
    Cleric(String name, int HP) {
        this.name = name;
        this.hp = HP;
        this.mp = maxMp;
    }
    Cleric(String name) {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }


    //selfAid() 메소드 추가 인수가 없고, 리턴 값도 없다.
    public void selfAid() {
        if (hp == maxHp) return; // 이미 max라면 return
        if (mp < 5) return;      // mp가 부족하면 return
        mp -= 5;

        if(mp >= 5) {
            if (hp < maxHp) {
                hp = maxHp;
            }
        }

        System.out.println(name + "셀프 에이드를 사용했습니다");
        System.out.println("HP가 전부 회복되었습니다");
        hp = maxHp;
    }

    // 성직자에게 '기도하기'을 지시 - 초당 MP 회복 0~2 랜덤하게 상승/3초 3~5회복
    public int pray(int sec) {
        Random rand = new Random();
        if (mp == maxMp) return 0; // 이미 max라면 return

        // 회복량 recoveryMp에 저장
        int recoveryMp = rand.nextInt(3) + sec; // 0~2 랜덤값 + 기도 시간(s)

        // 0~2 보정치 추가
        int recovery = sec + rand.nextInt(3);

        // 최대 MP를 넘지 않도록
        int actualRecovery = Math.min(maxMp - mp, recovery);
        mp += actualRecovery;
        System.out.println(name + "는 " + sec + "초 동안 기도하여 MP를 "
                    + actualRecovery + " 회복했습니다.");
        return actualRecovery;
        // maxMp 보다 더 회복하는가?
        if (recoveryMp + mp > maxMp) {
            recoveryMp = maxMp - mp;
        }

        // mp 회복
        mp += recoveryMp;
        return recoveryMp;
    }

    @Override
    public void attack(Slime slime) {
    }

}
