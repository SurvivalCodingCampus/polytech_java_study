package com.survivalcoding;


import java.util.Random;

public class Hero {
    private String name;    // null
    private int hp;
    private int mp;
    private Sword sword;    // null

    public Hero() {
        this.name = "대장";
        this.hp = 10;
        this.mp = 1;
        this.setSword(new Sword());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}