package com.survivalcoding.Game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WandTest {


    @Test
    @DisplayName("완드 생성 테스트")
    void testWand() {
        Wand wand = new Wand("지팡이", 50);
        assertEquals("지팡이", wand.getName());
        assertEquals(50, wand.getPower());

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("터짐");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0.4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(100.1);
        });

    }


}