package com.survivalcoding.Character;

public class Hero {
    private String name;
    private int hp;
    final private int maxHp;

    public Hero(String name, int hp) {
        setName(name);
        setHp(hp);
        this.maxHp = getHp();
    }

    public Hero(String name) {
        this(name, 100);
    }

    public Hero(int hp) {
        this("hero", hp);
    }

    public Hero() {
        this("hero", 100);
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
        if (hp < 0) setHp(0);
        else this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
