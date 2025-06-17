package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
            throw new IllegalArgumentException("hp 값은 음수가 됨");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0)
            throw new IllegalArgumentException("mp 값이 0 이하");
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int revocPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + revocPoint);
    }
}
