package com.survivalcoding;

public class Hero {
    String name;
    int hp;

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
        if (hp > 100) {
            return;
        }
        this.hp = hp;
    }
}
