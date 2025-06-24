package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {

    @Test
    @DisplayName("superHeal에서 mp가 50보다 작으면 hp != maxhp로 회복 못함.")

    public void belowMp50NoRecoverHeroHp() {
       GreatWizard greatWizard = new GreatWizard();
       Hero hero = new Hero();

        hero.setHp(50);
        greatWizard.setMp(49);

        greatWizard.superHeal(hero);

        assertEquals(50,hero.getHp());
    }
}