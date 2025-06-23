package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {
    Wand wand = new Wand("아아아아", 20);

    @Test
    @DisplayName("selfAid()를 하면 mp-5 하면 hp = maxhp가 된다")
    void testWizard() {

        //given(준비)
        final Wizard wizard = new Wizard("김상무", 20, 5, wand);

        //when(실행)

        //then(검증)
        assertThrows(IllegalArgumentException.class, () -> wizard.setMp(-1));
    }


    @Test
    @DisplayName("정상적 힐 시전")
    void testNormalheal() {
        //given(준비)
        Wizard wizard = new Wizard("아아달프", 100, 50, wand);
        Hero hero = new Hero("용아옹사", 80);
        System.out.println("힐 시전 전:");
        assertEquals(50, wizard.getMp());

        //when(실행)
        wizard.heal(hero);

        //then(검증)
        assertEquals(40, wizard.getMp());


    }
}