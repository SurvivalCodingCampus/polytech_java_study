package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonSlimeTest {
    @Test
    @DisplayName("5번 독공격 가능해야 함")
    void testPoisonSlimeattack2() {
        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero("Hero", 100);
        assertEquals(PoisonSlime.DEFAULT_POISONCOUNT, poisonSlime.getPoisonCount());
        poisonSlime.attack(hero);

        for (int i = 0; i < PoisonSlime.DEFAULT_POISONCOUNT; i++) {
            poisonSlime.attack(hero);
        }
        // then
        assertEquals(0, poisonSlime.getPoisonCount());

        poisonSlime.attack(hero);
        assertEquals(0, poisonSlime.getPoisonCount());

    }

    @Test
    @DisplayName("hero의 hp를 20 회복시키고 자신의 mp를 10 소모")
    void testPoisonSlimeattack() {
        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero("Hero", 100);

        poisonSlime.attack(hero);

        // then
        assertEquals(72, hero.getHp());
        assertEquals(4, poisonSlime.getPoisonCount());

    }

}