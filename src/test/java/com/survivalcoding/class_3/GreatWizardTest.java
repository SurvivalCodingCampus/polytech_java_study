package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {
    @Test
    @DisplayName("heal, superHeal 메서드 확인")
    void heal() {
        GreatWizard greatWizard = new GreatWizard();
        assertEquals(150, greatWizard.getMp());

        Hero hero = new Hero();
        greatWizard.heal(hero);
        assertEquals(125, hero.getHp());
        assertEquals(145, greatWizard.getMp());

        hero.setHp(10);
        greatWizard.superHeal(hero);
        assertEquals(100, hero.getHp());
        assertEquals(95, greatWizard.getMp());

        greatWizard.setMp(1);
        greatWizard.superHeal(hero);
        assertEquals(100, hero.getHp());

        greatWizard.heal(hero);
        assertEquals(100, hero.getHp());
    }

}