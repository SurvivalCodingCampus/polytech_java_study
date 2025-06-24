package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {
    Wand wand = new Wand("아아아아", 20);

    @Test
    @DisplayName("heal 테스트 / mp 충분")
    void testHealFinempWizard() {
        //given(준비)
        GreatWizard Greatwizard = new GreatWizard("아아달프", 100, wand);
        Hero hero = new Hero("용아옹사", 80);
        System.out.println("힐 시전 전:");
        assertEquals(150, Greatwizard.getMp());//mp 150으로 증가

        //when(실행)
        Greatwizard.heal(hero);

        //then(검증)
        assertEquals(145, Greatwizard.getMp());// mp -5 소모

    }


    @Test
    @DisplayName("SuperHeal 테스트 / mp 충분")
    void testSuperHealFineMpWizard() {
        //given(준비)
        GreatWizard Greatwizard = new GreatWizard("아아달프", 100, wand);
        Hero hero = new Hero("용아옹사", 80);
        System.out.println("힐 시전 전:");
        assertEquals(150, Greatwizard.getMp());//mp 150으로 증가

        //when(실행)
        Greatwizard.superHeal(hero);

        //then(검증)
        assertEquals(100, Greatwizard.getMp());// mp -50 소모

    }

}