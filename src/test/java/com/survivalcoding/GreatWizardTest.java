package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {
    @Test
    @DisplayName("heal 테스트")
    void heal1() {
        Wand wand = new Wand("bbb", 10.0);
        Hero hero = new Hero("ccc", Cleric.MAX_HP);
        GreatWizard wizard = new GreatWizard(Cleric.MAX_HP, 150, "aaa", wand);

        wizard.heal(hero);

        assertEquals(Cleric.MAX_HP, hero.getHp());
        assertEquals(100, wizard.getMp());


    }
}