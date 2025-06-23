package com.survivalcoding.assignments_01_instance.exam01;

public class Slime {
    final String suffix;
    int hp;


    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
