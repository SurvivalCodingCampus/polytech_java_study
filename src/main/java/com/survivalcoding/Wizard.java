package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    Wand wand;

    void heal(Hero hero)
    {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

}
