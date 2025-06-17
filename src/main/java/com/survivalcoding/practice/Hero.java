package com.survivalcoding.practice;

import java.util.Random;

public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    // 생성자
    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // getter, setter
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없습니다");
        }
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}