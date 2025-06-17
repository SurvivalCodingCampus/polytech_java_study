package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {

    int hp;
    int mp;
    String name;
    Wand wand;

    void heal(Hero hero)
    {
        int basePoint = 10;//기본 회복 포인트
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    Wizard (int hp, int mp, String name)
    {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void wizardTest()
    {
        System.out.println(hp);
        System.out.println(mp);
        System.out.println(name);
    }
}
