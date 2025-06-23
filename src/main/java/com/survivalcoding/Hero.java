package com.survivalcoding;

public class Hero {
    private String name;
    private int hp;

    Hero(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp < 0 || hp > 100) {
            return;
        }
        this.hp = hp;
    }
}
