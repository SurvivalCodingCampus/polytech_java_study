package com.survivalcoding.assignments_01_instance.exam01;
import java.util.Random;

public class Cleric {
    String name;
    int hp;
    static final int Max_HP = 50;
    int mp;
    static final int Max_MP = 10;

    Cleric(String name, int HP, int MP) {
        this.name = name;
        this.hp = HP;
        this.mp = MP;
    }
    Cleric(String name, int HP) {
        this.name = name;
        this.hp = HP;
        this.mp = Max_MP;
    }
    Cleric(String name) {
        this.name = name;
        this.hp = Max_HP;
        this.mp = Max_MP;
    }
    Cleric() {

    }

    //selfAid() 메소드 추가 인수가 없고, 리턴 값도 없다.
    public void selfAid() {
        mp -= 5;

        if(mp >= 5) {
            if (hp < Max_HP) {
                hp = Max_HP;
            }
        }

        System.out.println(name + "셀프 에이드를 사용했습니다");
        System.out.println("HP가 전부 회복되었습니다");
    }

    // 성직자에게 '기도하기'을 지시 - 초당 MP 회복 0~2 랜덤하게 상승/3초 3~5회복
    public int pray(int sec) {
        Random rand = new Random();


        // 0~2 보정치 추가
        int recovery = sec + rand.nextInt(3);

        // 최대 MP를 넘지 않도록
        int actualRecovery = Math.min(Max_MP - mp, recovery);
        mp += actualRecovery;
        System.out.println(name + "는 " + sec + "초 동안 기도하여 MP를 "
                    + actualRecovery + " 회복했습니다.");
        return actualRecovery;

    }


}
