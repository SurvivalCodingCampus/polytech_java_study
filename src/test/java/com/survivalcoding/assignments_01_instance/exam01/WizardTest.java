package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {
    @Test
    @DisplayName("이름은 null이 아니어야 함")
    void testwizardname() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("");
        });
    }

    @Test
    @DisplayName("이름은 3글자 이상이어야 함")
    void testwizardname2() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("마법");
        });
    }

    @Test
    @DisplayName("mp 초기값 100")
    void testwizardmp() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));

        // then
        assertEquals(100, wizard.getHp());
    }

    @Test
    @DisplayName("마법사의 지팡이는 null 일 수 없다.")
    void testwizardwand() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
    }

    @Test
    @DisplayName("HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.")
    void testwizardhp() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));
        wizard.setHp(-5);

        // then
        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.")
    void testwizardhp2() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));

        // then

        assertEquals(100, wizard.getHp());
    }

    @Test
    @DisplayName("hero의 hp를 20 회복시키고 자신의 mp를 10 소모")
    void testwizardheal() {
        //given
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));
        wizard.setMp(5);

        Hero hero = new Hero("Hero", 50);

        wizard.heal(hero);

        // then
        assertEquals(70, hero.getHp());
        assertEquals(90, wizard.getMp());
    }


}