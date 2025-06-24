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
        this.mp = 100;  // 초기값 100으로 수정
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
        this.hp = Math.max(hp, 0);
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
        if (this.mp < 10) {
            System.out.println("마나가 부족합니다");
        } else {
            this.mp -= 10;
            hero.setHp(hero.getHp() + 20);
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        }
    }
}
