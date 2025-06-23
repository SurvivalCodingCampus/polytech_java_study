package com.survivalcoding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreatWizardTest {

    @Test
    @DisplayName("공격 확인")
    void testGreatWizard() {
        Wand wand = new Wand("팡이팡이지팡이", 10);
        GreatWizard greatWizard = new GreatWizard(100, 150, "김대마법사", wand);
        Hero hero = new Hero("김용사", 30);

        greatWizard.heal(hero);
        assertEquals(55, hero.getHp());

        greatWizard.superHeal(hero);
        assertEquals(100, hero.getHp());


    }
}