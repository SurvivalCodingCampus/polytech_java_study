package com.survivalcoding;

public class Hero {

    String name;
    int Hp;
    int Mp;
    static int money;

    Hero(int Hp){
        this.Hp = Hp;
        this.Mp = 100;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getMp() {
        return Mp;
    }

    public void setMp(int mp) {
        Mp = mp;
    }
}
