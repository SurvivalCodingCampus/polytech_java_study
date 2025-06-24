package com.survivalcoding.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PoisonSlimeTest {

    @Test
    @DisplayName("공격 확인")
    void testSlime() {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero("김아무개", 100);

        poisonSlime.attack(hero);

        assertEquals(72, hero.getHp());
        assertEquals(4, poisonSlime.getPoisonCount());

    }

}