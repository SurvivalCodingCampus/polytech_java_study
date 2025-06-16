package com.survivalcoding;

public class Wizard {
    String name;
    int hp;

    void heal(Hero hero) {
        hero.hp += 10;
    }
}