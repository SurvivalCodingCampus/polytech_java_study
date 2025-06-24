package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    @Test
    @DisplayName("PoisonSlime 생성")
    void createPoisonSlimeTest() {
        PoisonSlime poisonSlime = new PoisonSlime("A");

        assertEquals("A", poisonSlime.getSuffix());
        assertEquals(5, poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("attack")
    void attackTest() {
        PoisonSlime poisonSlime = new PoisonSlime("C");
        Hero hero = new Hero("용사", 100);

        poisonSlime.attack(hero);
        assertEquals(4, poisonSlime.getPoisonCount());
        assertEquals(72, hero.getHp());
        for (int i = 0; i < 4; i++) {
            poisonSlime.attack(hero);
        }

        assertEquals(0, poisonSlime.getPoisonCount());
        assertEquals(7, hero.getHp());
    }

    @Test
    @DisplayName("독 공격 횟수 감소")
    void poisonCountDecreaseTest() {
        PoisonSlime poisonSlime = new PoisonSlime("D");
        Hero hero = new Hero("용사", 500);

        assertEquals(5, poisonSlime.getPoisonCount());

        for (int i = 4; i >= 0; i--) {
            poisonSlime.attack(hero);
            assertEquals(i, poisonSlime.getPoisonCount());
        }
    }

}