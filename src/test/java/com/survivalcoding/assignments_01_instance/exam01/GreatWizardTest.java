package com.survivalcoding.assignments_01_instance.exam01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class GreatWizardTest {

    @Test
    @DisplayName("생성자 테스트")
    void createGreatWizardWithNameTest() {
        GreatWizard wizard = new GreatWizard("마법사");

        assertEquals("마법사", wizard.getName());
        assertEquals(100, wizard.getHp());
        assertEquals(150, wizard.getMp()); // 기본 마법사는 100이지만 GreatWizard는 150
        assertNull(wizard.getWand());
    }

    @Test
    @DisplayName("생성자 지팡이 포함 테스트")
    void createGreatWizardWithNameAndWandTest() {
        Wand wand = new Wand("지팡이");
        GreatWizard wizard = new GreatWizard("마법사", wand);

        assertEquals("마법사", wizard.getName());
        assertEquals(100, wizard.getHp());
        assertEquals(150, wizard.getMp());
        assertEquals(wand, wizard.getWand());
    }

    @Test
    @DisplayName("생성자 all 테스트")
    void createGreatWizardWithAllParamsTest() {
        Wand wand = new Wand("지팡이");
        GreatWizard wizard = new GreatWizard("마법사", 80, 200, wand);

        assertEquals("마법사", wizard.getName());
        assertEquals(80, wizard.getHp());
        assertEquals(200, wizard.getMp());
        assertEquals(wand, wizard.getWand());
    }

    @Test
    @DisplayName("heal")
    void healSuccessTest() {
        GreatWizard wizard = new GreatWizard("마법사");
        Hero hero = new Hero("용사", 100);
        hero.setHp(50);

        wizard.heal(hero);

        assertEquals(75, hero.getHp());
        assertEquals(145, wizard.getMp());
    }

    @Test
    @DisplayName("heal 마나 부족 테스트")
    void healInsufficientMpTest() {
        GreatWizard wizard = new GreatWizard("마법사");
        wizard.setMp(3);
        Hero hero = new Hero("용사", 100);
        hero.setHp(50);

        wizard.heal(hero);

        assertEquals(50, hero.getHp());
        assertEquals(3, wizard.getMp());
    }

    @Test
    @DisplayName("superHeal")
    void superHealSuccessTest() {
        GreatWizard wizard = new GreatWizard("마법사");
        Hero hero = new Hero("용사", 100);
        hero.setHp(30);

        wizard.superHeal(hero);

        assertEquals(100, hero.getHp());
        assertEquals(100, wizard.getMp());
    }

    @Test
    @DisplayName("superHeal 마나 부족")
    void superHealInsufficientMpTest() {
        GreatWizard wizard = new GreatWizard("마법사");
        wizard.setMp(40);
        Hero hero = new Hero("용사", 100);
        hero.setHp(30);

        wizard.superHeal(hero);

        assertEquals(30, hero.getHp());
        assertEquals(40, wizard.getMp());
    }

    @Test
    @DisplayName("HP 최대치 테스트")
    void healDoesNotExceedMaxHpTest() {
        GreatWizard wizard = new GreatWizard("힐러");
        Hero hero = new Hero("용사", 100);
        hero.setHp(90);

        wizard.heal(hero);

        assertEquals(100, hero.getHp());
        assertEquals(145, wizard.getMp());
    }
}