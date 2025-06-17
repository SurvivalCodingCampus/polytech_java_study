package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {
    @Test
    @DisplayName("이름은 null이 아니어야 함")
    void testwandname() {
        //given
        Wand wand = new Wand("지팡이", 5);

        // then

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("");
        });
    }

    @Test
    @DisplayName("이름은 3글자 이상이어야 함")
    void testwandname2() {
        //given
        Wand wand = new Wand("지팡이", 5);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("지팡");
        });
    }

    @Test
    @DisplayName("지팡이의 마력은 0.5 이상 100.0 이하여야 한다.")
    void testwandpower() {
        //given
        Wand wand = new Wand("지팡이", 5);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(105);
        });
    }
}

