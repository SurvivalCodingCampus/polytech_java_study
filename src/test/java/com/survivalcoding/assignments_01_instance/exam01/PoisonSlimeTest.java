package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    PoisonSlime poisonSlime = new PoisonSlime(100, "A");
    int count = 5;

    @Test
    void getCount() {

        assertEquals(5, poisonSlime.getCount());
    }

    @Test
    void attack() {

        Hero hero = new Hero("용사", 100);

        poisonSlime.attack(hero);

        assertEquals(72, hero.getHp());

    }

    @Test
    void AttackCounte() {
        count--;
    }

}