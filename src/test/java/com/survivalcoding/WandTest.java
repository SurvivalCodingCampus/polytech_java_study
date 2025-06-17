package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {

    @Test
    @DisplayName("getter 테스트")
    void setter1() {
        Wand wand = new Wand("g1", 20);
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
    }

    @Test
    @DisplayName("getter 테스트")
    void setter2() {
        Wand wand = new Wand("g2", 30);
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(1110);
        });
    }

    @Test
    @DisplayName("getter 테스트")
    void getter1() {
        Wand wand = new Wand("getter", 10);

        assertEquals("gett2er", wand.getName());
        assertEquals(110, wand.getPower());

    }
}