package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PoisonSlimeTest {
    Hero hero;

    @BeforeEach
    void setUp() {
        hero = new Hero("Heroooooo", 100);
    }

    @Test
    public void testPoison() {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        for (int i = 0; i < 5; i++)
            poisonSlime.attack(hero);

        assertThrows(IllegalArgumentException.class, () -> {
            poisonSlime.attack(hero);
        });
    }
}