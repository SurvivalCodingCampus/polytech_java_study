package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void heroTest(){
        Hero hero = new Hero("영웅", 100);
        assertEquals(100, hero.getHp());

        hero.setHp(0);
        assertEquals(0, hero.getHp());

        assertThrows(IllegalArgumentException.class, () -> {
            hero.setHp(-100);
        });
    }
}