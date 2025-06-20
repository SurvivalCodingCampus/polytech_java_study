package com.survivalcoding.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SwordTest {
    @Test
    @DisplayName("Sword 클래스 매개변수 없는 생성자 테스트")
    void testDefaultConstructor() {
        Sword sword = new Sword();

        assertEquals("소드 이름", sword.name);
        assertEquals(10, sword.damage);
    }

    @Test
    @DisplayName("Sword 클래스 매개변수 있는 생성자 테스트")
    void testConstructorWithName() {
        String name = "엑스칼리버";
        Sword sword = new Sword(name);

        assertEquals(name, sword.name);
        assertEquals(10, sword.damage);
    }
}