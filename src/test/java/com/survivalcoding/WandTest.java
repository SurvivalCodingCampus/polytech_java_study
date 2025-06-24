package com.survivalcoding;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {
    Wand wand;

    @BeforeEach
    void setUp() {
        wand = new Wand("꾸부러진 지팡이");
    }

    @AfterEach
    void tearDown() {
//        System.out.println("끝날 때");
    }

    @Test
    @DisplayName("지팡이의 이름은 null 일 수 없다")
    void setNameTest1() {
        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
    }

    @Test
    @DisplayName("지팡이의 이름은 3문자 이상이어야 한다")
    void setNameTest2() {
        wand.setName("aaaa");
        assertEquals("aaaa", wand.getName());

        wand.setName("aaa");
        assertEquals("aaa", wand.getName());

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("aa");
        });
    }
}