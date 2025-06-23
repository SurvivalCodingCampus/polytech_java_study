package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    int poisonCount = 5;

    @Test
    @DisplayName("PoisonCount가 0이면 독공격 실행하지 않음")
    void noPoisonAttackCountZero() {
        Hero hero = new Hero();
        hero.setHp(50);

        PoisonSlime poisonSlime = new PoisonSlime("A");
        poisonSlime.poisonCount = 0;

        poisonSlime.attack(hero);
        assertEquals(40, hero.getHp());
    }

    @Test
    @DisplayName("PoisonCount는 0보다 작아지지 않음")
    void minusCountNeverExistence() {
        Hero hero = new Hero();
        hero.setHp(100);
        PoisonSlime poisonSlime = new PoisonSlime("B");

        for (int i =0; i<6; i++) {
            poisonSlime.attack(hero);
        }

        assertTrue(poisonSlime.getPoisonCount() >=0);

    }
}