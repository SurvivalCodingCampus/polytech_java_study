package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
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
}