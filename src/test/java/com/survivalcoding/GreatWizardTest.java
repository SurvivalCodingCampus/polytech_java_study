package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GreatWizardTest {

    Wand wand;

    @BeforeEach
    void setUp() {

        wand = new Wand("wand", 100);
    }

    @Test
    void heal() {
        Hero hero = new Hero("superhero", 0);
        ;
        GreatWizard greatWizard = new GreatWizard(100, "greater", wand);
        for (int i = 0; i < 8; i++)
            greatWizard.heal(hero);

        assertThrows(IllegalArgumentException.class, () -> greatWizard.heal(hero));

    }

    @Test
    void superHeal() {
        Hero hero = new Hero("superhero", 0);
        ;
        GreatWizard greatWizard = new GreatWizard(100, "greater", wand);
        for (int i = 0; i < 3; i++)
            greatWizard.superHeal(hero);

        assertThrows(IllegalArgumentException.class, () -> greatWizard.superHeal(hero));

    }

}