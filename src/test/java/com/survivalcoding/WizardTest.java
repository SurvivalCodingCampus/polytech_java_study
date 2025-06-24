package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {
    Wand wand;
    Hero hero;

    @BeforeEach
    void setUp() {
        wand = new Wand("마법사의 불꽃", 99);
        hero = new Hero("Hero", 100);
    }

    @Test
    void constructor() {
        Wizard wizard = new Wizard(1, 2, "3333", wand);

        assertEquals(1, wizard.getHp());
        assertEquals(2, wizard.getMp());
        assertEquals("3333", wizard.getName());
        assertEquals("마법사의 불꽃", wizard.getWand().getName());
        assertEquals(99, wizard.getWand().getPower());
    }

    @Test
    void setTester() {

        Wizard wizard = new Wizard(1, 2, "3333", wand);

        wizard.setHp(-1);
        assertEquals(0, wizard.getHp());

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("o");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
    }

    @Test
    void healTest() {
        Wizard wizard = new Wizard(100, "geartttt", wand);
        for (int i = 0; i < 10; i++)
            wizard.heal(hero);
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.heal(hero);
        });
    }

}