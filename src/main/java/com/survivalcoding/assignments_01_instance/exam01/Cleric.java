package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Cleric {
    String name;
    public int hp;
    public int mp;
    public final int maxHp = 50;
    public final int maxMp = 10;
    private static final int sec = 1; //기도할시간

    Random random = new Random();

    Cleric(String name, int hp, int mp)
    {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
        this.mp = maxMp;
    }

    Cleric(String name)
    {
        this.name = name;
        this.hp = maxHp;
        this.mp = maxMp;
    }

    public void selfAid() {
        if(mp >= 5  && hp < maxHp){
            mp -=5;
            hp = maxHp;
        } else if (hp == maxHp ) {
            mp -= 5;
        }
    }

    public int pray() {
        int num = random.nextInt(3);
        int recoveredAmount = 0;

        if (mp < maxMp) {
            recoveredAmount = sec + num;
            mp = mp + recoveredAmount;

            if (mp > maxMp) {
                recoveredAmount -= (mp - maxMp);
                mp = maxMp;
            }
        }
        return recoveredAmount;
    }

    public void test(){
        System.out.println("이름 " + this.name);
        System.out.println(hp);
        System.out.println(mp);
    }

    public void test2() {
        System.out.println("이름 " + this.name);
        System.out.println(hp);
        System.out.println(mp);
    }

    public void test3() {
        System.out.println("이름 " + this.name);
        System.out.println(hp);
        System.out.println(mp);
    }
    public void test4() {
        pray();
        selfAid();
    }
}
