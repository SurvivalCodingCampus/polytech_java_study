package com.survivalcoding.assignments_01_instance.exam01;

import java.sql.Time;

public class Cleric {

    private String name;
    private int hp;
    private int mp;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    public Cleric(String name) {
        hp = MAX_HP;
        mp = MAX_MP;
        this.name = name;
    }

    public void selfAid(){
        mp -= 5;
        hp = MAX_HP;
    }

    public int pray(int sec){
        int result = 0;

        for(int i = 1; i <= sec; i++){
            result += getRandomNumber(0, 2);
        }

        return result;
    }

    private int getRandomNumber(final int min, final int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }

}
