package com.survivalcoding.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    @DisplayName("Hero 클래스 생성자 테스트 ")
    void testConstructor() {
        String name = "jjangu";
        int hp = 100;

        Hero hero = new Hero(name, hp);

        assertEquals(name, hero.getName());
        assertEquals(hp, hero.getHp());
    }
}