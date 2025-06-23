package com.survivalcoding.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {

    @Test
    @DisplayName("Wand 생성자 테스트_유효한 입력")
    void testConstructor() {
        Wand wand = new Wand("Staff", 10.0);

        assertEquals("Staff", wand.getName());
        assertEquals(10.0, wand.getPower());
    }

    @Test
    @DisplayName("지팡이 이름이 null일 경우 예외 발생")
    void testConstructorNameIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wand(null, 10.0);
        });

        assertEquals("지팡이 이름은 반드시 입력해 주세요", e.getMessage());
    }

    @Test
    @DisplayName("지팡이 이름이 3글자 미만일 경우 예외 발생")
    void testConstructorNameTooShort() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wand("AB", 10.0);
        });

        assertEquals("지팡이 이름은 3글자 이상이어야 합니다", e.getMessage());
    }

    @Test
    @DisplayName("지팡이 파워가 0.5 미만일 경우 예외 발생")
    void testConstructorPowerTooLow() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wand("IceRod", 0.3);
        });

        assertEquals("지팡이 파워는 0.5 이상이어야 합니다", e.getMessage());
    }

    @Test
    @DisplayName("지팡이 파워가 100 초과일 경우 예외 발생")
    void testConstructorPowerTooHigh() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wand("ThunderStick", 150.0);
        });

        assertEquals("지팡이 파워는 100 이하여야 합니다", e.getMessage());
    }
}
