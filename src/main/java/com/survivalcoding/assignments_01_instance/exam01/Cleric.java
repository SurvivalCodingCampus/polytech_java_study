package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {
    private String name = "Cleric";
    private int hp = 50;
    private int mp = 10;
    private final int maxHp = 50;
    private final int maxMp = 10;
    private int prayerTime = 1;
    private int addmp;
    Random random = new Random();
    //Scanner scanner = new Scanner(System.in);

    public void selfAid() {
        if(mp >= 5  && hp < maxHp){
            mp -=5;
            hp = maxHp;
        } else if (hp == maxHp ) {
            mp -= 5; //hp가 가득 차 있어도 mp5 소모
        }
    }

    public int pray( ) {
        int num = random.nextInt(3); //0~2

        if (mp < maxMp) {
            addmp = prayerTime + num;
            mp = mp + addmp;

            if (mp > maxMp) {
                mp = maxMp;
            }
        }
        return addmp;
    }

    public void test(){
        System.out.println("이름 " + this.name);
        selfAid();
        pray();
        System.out.println("MP : " + this.mp);
        System.out.println("회복된 mp 양 : " + addmp);
        System.out.println("기도 시간 : " + prayerTime);
    }

}
