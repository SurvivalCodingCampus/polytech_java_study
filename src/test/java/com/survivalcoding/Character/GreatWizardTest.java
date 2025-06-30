package com.survivalcoding.Character;

import com.survivalcoding.Character.GreatWizard;
import com.survivalcoding.Character.Hero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {
    @Test
    @DisplayName("mp 값을 150으로 초기화")
    void setMP() {
        GreatWizard wizard = new GreatWizard();
        assertEquals(150, wizard.getMp());
    }

    @Test
    @DisplayName("heal() 실행 시 mp를 5 소모하여 대상의 hp를 25 회복")
    void heal() {
        Hero hero = new Hero();
        GreatWizard wizard = new GreatWizard();

        hero.setHp(25);
        int heroHp = hero.getHp();
        wizard.heal(hero);
        heroHp += 25;

        assertEquals(heroHp, hero.getHp());
    }

    @Test
    @DisplayName("superHeal() 실행 시 mp를 50 소모하여 대상의 hp를 전부 회복")
    void superHeal() {
        Hero hero = new Hero();
        GreatWizard wizard = new GreatWizard();

        int wizardMp = wizard.getMp();
        hero.setHp(25);
        wizard.superHeal(hero);
        wizardMp -= 50;

        assertEquals(100, hero.getHp());
        assertEquals(wizardMp, wizard.getMp());
    }
}