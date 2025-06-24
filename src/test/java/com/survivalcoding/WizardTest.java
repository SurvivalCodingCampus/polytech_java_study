package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    @DisplayName("마법사 힐 테스트, MP 10을 써서 HP 20을 채운다")
    void testWizardHeal() {
        Hero hero = new Hero("Zelda", 1);
        Wizard wizard = new Wizard("Link", new Wand("Wood wand", 99.9));

        wizard.heal(hero);

        assertEquals(21, hero.getHp());
    }

    @Test
    @DisplayName("대마법사 힐 테스트, MP 5를 써서 HP 25를 채운다")
    void testGreatWizardHeal() {
        Hero hero = new Hero("Zelda", 1);
        GreatWizard wizard = new GreatWizard("Link", new Wand("Wood wand", 99.9));

        wizard.heal(hero);

        assertEquals(26, hero.getHp());
    }

    @Test
    @DisplayName("대마법사 슈퍼힐 테스트, MP 50를 써서 HP를 모두 채운다")
    void testGreatWizardSuperHeal() {
        Hero hero = new Hero("Zelda", 1); // Hero 최대체력 50
        GreatWizard wizard = new GreatWizard("Link", new Wand("Wood wand", 99.9));

        wizard.superHeal(hero);

        assertEquals(50, hero.getHp());
    }

    @Test
    @DisplayName("모자른 마나로 힐을 쓸 수 없음 테스트")
    void testWizardHealInsufficientMp() {
        Hero hero = new Hero("Zelda", 1);
        GreatWizard wizard = new GreatWizard("Link", 20, 1, new Wand("Wood wand", 99.9));

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.heal(hero);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.superHeal(hero);
        });
    }
}