package com.survivalcoding.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    @DisplayName("Wizard 생성자 테스트_유효한 입력")
    void testConstructor() {
        Wand wand = new Wand("Magic Wand", 1.5);
        Wizard wizard = new Wizard(100, 50, "Merlin", wand);

        assertEquals(100, wizard.getHp());
        assertEquals(50, wizard.getMp());
        assertEquals("Merlin", wizard.getName());
        assertEquals(wand, wizard.getWand());
    }

    @Test
    @DisplayName("hp가 음수일 경우 0")
    void testConstructorHpNegative() {
        Wand wand = new Wand("Magic Wand", 1.2);
        Wizard wizard = new Wizard(-30, 50, "Gandalf", wand);

        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("이름이 null일 경우 예외가 발생")
    void testConstructorNameIsNull() {
        Wand wand = new Wand("Magic Wand", 1.2);

        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wizard(100, 50, null, wand);
        });

        assertEquals("마법사 이름은 반드시 입력해 주세요", e.getMessage());
    }

    @Test
    @DisplayName("이름이 3글자 미만일 경우 예외 발생")
    void testConstructorNameTooShort() {
        Wand wand = new Wand("Magic Wand", 1.2);

        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wizard(100, 50, "HI", wand);
        });

        assertEquals("마법사 이름은 3글자 이상이어야 합니다", e.getMessage());
    }

    @Test
    @DisplayName("mp가 음수일 경우 예외 발생")
    void testConstructorMpNegative() {
        Wand wand = new Wand("Magic Wand", 1.2);

        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wizard(100, -10, "Hello", wand);
        });

        assertEquals("마법사의 mp는 0 이상이어야 합니다", e.getMessage());
    }

    @Test
    @DisplayName("지팡이가 null일 경우 예외 발생")
    void testConstructorWandIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            new Wizard(100, 50, "Hello", null);
        });

        assertEquals("마법사의 지팡이는 null일 수 없습니다", e.getMessage());
    }
}
