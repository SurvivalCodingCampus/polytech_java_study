package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreateWizardTest {
    GreateWizard greateWizard = new GreateWizard("대마법사");

    @Test
    @DisplayName("Wizard 객체 생성 시 올바르게 생성되는지")
    void testCreate() {
        // then
        assertEquals(150, GreateWizard.maxHp);
        assertEquals(150, GreateWizard.maxMp);
    }

    @Test
    @DisplayName("재정의한 Heal 메서드 실행 후 hero의 hp 및 greateWizard의 mp 검증")
    void testHeal() {
        // given
        Hero hero = new Hero();
        int beforeHp = hero.getHp();
        int beforeMp = greateWizard.getMp();

        // when
        greateWizard.heal(hero);

        // then
        assertEquals(beforeHp + 25, hero.getHp());
        assertEquals(beforeMp - 5, greateWizard.getMp());
    }

    @Test
    @DisplayName("SuperHeal 메서드 실행 후 hero의 hp 및 greateWizard의 mp 검증")
    void testSuperHeal() {
        // given
        Hero hero = new Hero();
        int beforeHp = hero.getHp();
        int beforeMp = greateWizard.getMp();

        // when
        greateWizard.superHeal(hero);

        // then
        assertEquals(Hero.maxHp, beforeHp + (Hero.maxHp - beforeHp));
        assertEquals(beforeMp - 50, greateWizard.getMp());
    }
}
