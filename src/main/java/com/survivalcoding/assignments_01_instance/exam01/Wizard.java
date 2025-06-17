package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    String name;
    int hp;

    void heal(Hero hero) {
        hero.hp += 10;
    }
}
