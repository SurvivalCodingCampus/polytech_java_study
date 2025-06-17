package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void heroTest() {
        Hero hero = new Hero();
        assertEquals(100, hero.getHp());

        hero.setHp(0);
        assertEquals(0, hero.getHp());
        hero.setHp(1);
        assertEquals(1, hero.getHp());

        assertThrows(IllegalArgumentException.class, () -> {
            hero.setHp(-100);
        });

    }
}