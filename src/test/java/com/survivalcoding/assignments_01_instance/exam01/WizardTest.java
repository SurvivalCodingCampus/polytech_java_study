package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    @DisplayName("지팡이의 이름은 Null 이 아니고 3문자 이상이다.")
    void setWand() {
        //given
        String wandName = "myPet";
        //when
        Wand wand = new Wand();
        wand.setName(wandName);
        //then
        Assertions.assertEquals(wandName, wand.getName());
    }

    @Test
    @DisplayName("지팡이의 이름은 NULL이거나 3문자보다 작을 경우 예외가 발생한다.")
    void setWandException() {
        //given
        //when
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setName("");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setName(null);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setName("12");
                });
        //then
    }

    @Test
    @DisplayName("지팡이의 마력은 .5이상 100 이햐여야 한다.")
    void setPower() {
        //given
        double power = 50.5f;
        //when
        Wand wand = new Wand();
        wand.setPower(power);
        //then
        Assertions.assertEquals(power, wand.getPower());
    }

    @Test
    @DisplayName("지팡이의 마력은 .5이상 100 이햐가 아닐경우 예외가 발생한다.")
    void setPowerException_1() {
        //given
        //when
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setPower(0f);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setPower(-100f);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Wand wand = new Wand();
                    wand.setPower(0.4f);
                });
        //then
    }

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

}