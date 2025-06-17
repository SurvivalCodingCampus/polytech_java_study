package com.survivalcoding;

public class Wizard {

    int hp;
    int mp;
    String name;
    Wand wand;

    void heal(Hero hero){
        int basePoint = 10;
        int recovPoint = (int)(basePoint*this.wand.power);
        hero.setHp(hero.getHp() + recovPoint);
    }
}
