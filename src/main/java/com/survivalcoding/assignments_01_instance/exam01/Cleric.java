package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {
    String name = "Cleric";
    int hp = 50;
    int mp = 10;
    final int maxHp = 50;
    final int maxMp = 10;
    int sec = 1;
    int s;
    Random random = new Random();
    //Scanner scanner = new Scanner(System.in);

    public void selfAid() {
        if(mp >= 5  && hp < maxHp){
            mp -=5;
            hp = maxHp;
        } else if (hp == maxHp ) {
            mp -= 5;
        }
    }

    public int pray( ) {
        int num = random.nextInt(3);

        if (mp < maxMp) {
            s = sec + num;
            mp = mp + s;

            if (mp > maxMp) {
                mp = maxMp;
            }
        }
        return s;
    }

    public void test(){
        System.out.println("이름 " + this.name);
        selfAid();
        pray();
        System.out.println("MP : " + this.mp);
        System.out.println("회복된 mp 양 : " + s);
        System.out.println("기도 시간 : " + sec);
    }

}
