package com.survivalcoding;

public class Wizard {
    private String name;
    private int hp;
    private int mp;
    private Wand wand;

    public Wizard(String name) {
        this(name, null);
    }

    public Wizard(String name, Wand wand) {
        this.name = name;
        this.wand = wand;
        this.hp = 100;
        this.mp = 50;
    }

    public Wizard(String name, int hp, int mp, Wand wand) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.wand = wand;
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
        this.hp = hp;

        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void heal(Hero hero) {
        hero.setHp(hero.getHp() + 10);
    }
}
