package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {

    GreatWizard greatWizard = new GreatWizard(100, 0, "Greatwizard",new Wand("지팡이", 10));

    @Test
    public void heal() {
        Hero hero = new Hero("용사A", 50);

        greatWizard.heal(hero);

        assertEquals(50, hero.getHp());
    }

    @Test
    public void superHeal() {
        Hero hero = new Hero("용사B", 40);

        greatWizard.superHeal(hero);

        assertEquals(40, hero.getHp());
    }
}