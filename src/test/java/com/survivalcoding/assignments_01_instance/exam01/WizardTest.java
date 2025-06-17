package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    @DisplayName("마법사의 지팡이는 NULL일 경우 예외가 발생한다.")
    void setWandException_2() {
        //given
        //when
        Wand nullableWand = null;
        //then
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wizard wizard = new Wizard();
                    wizard.setWand(nullableWand);
                });
    }

    @Test
    @DisplayName("마법사의 MP는 0 이상이여야 한다.")
    void setMp() {
        //given
        Wizard wizard = new Wizard();
        int amount = 10;
        //when
        wizard.setMp(amount);
        //then
        assertEquals(amount, wizard.getMp());
    }

    @Test
    @DisplayName("마법사의 MP는 0 이상이 아닐경우 예외가 발생 한다.")
    void setMpException() {
        //given//when//then
        Wizard wizard = new Wizard();
        Assertions.assertThrows(IllegalArgumentException.class, () -> wizard.setMp(-1));
    }

    @Test
    @DisplayName("마법사의 HP는 음수가 되는 상황에서 0을 대신해서 설정 되도록 한다.")
    void setHp() {
        //given
        Wizard wizard = new Wizard();
        int amount = -10;
        //when
        wizard.setHp(amount);
        //then
        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("마법사의 heal 메서드 사용시 지팡이 파워에 비례하여 회복된다.")
    void heal() {
        //given
        String wandName = "myPet";
        double power = 1f;
        Wand wand = new Wand();
        wand.setPower(power);
        wand.setName(wandName);
        Wizard wizard = new Wizard();
        wizard.setWand(wand);

        int clericHp = 1;
        Cleric cleric = new Cleric("Cleric", 1);

        //when
        wizard.heal(cleric);

        //then
        assertEquals(power * 10 + clericHp, cleric.getHp());
    }

}