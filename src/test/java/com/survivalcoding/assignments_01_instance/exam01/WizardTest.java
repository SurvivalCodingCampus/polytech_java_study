package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    Wizard wizard = new Wizard(30, 20, "마법", new Wand("지팡이", 10));

    /*@Test
    public void test() {
        wizard.wizardTest();

        assertEquals("마법", wizard.getName());
        assertEquals(30, wizard.getHp());
        assertEquals(20, wizard.getMp());

        wizard.setHp(10);
        wizard.setMp(100);
        wizard.setWand(null);

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(null);
        });
         assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });
    }*/

    @Test
    public void heal(){
        Hero hero = new Hero("용사", 60);

        wizard.heal(hero);
        assertEquals(60, hero.getHp());
    }
}