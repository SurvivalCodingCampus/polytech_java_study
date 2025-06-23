package com.survivalcoding;

public class Wizard {
    private int hp;
    static int mp = 100;
    private String name;
    private Wand wand;

    public Wizard(int hp, int mp, String name, Wand wand) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void heal(Hero hero)
    {
        int recovHp = 20;

        if(mp < 10)
        {
            System.out.println("마나가 부족합니다");
        }
        else
        {
            Wizard.mp -= 10;
            hero.setHp(hero.getHp() + recovHp);

            System.out.println("힐을 시전했습니다. 대상 HP:" + hero.getHp());
        }
    }



}
