package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {
    @Test
    @DisplayName("슬라임 종류별 공격력 비교")
    void slimeTest() {
        Slime slime = new Slime("A", 15);
        PoisonSlime poisonSlime = new PoisonSlime("B");

        // 생성
        assertEquals("A", slime.getSuffix());
        assertEquals(15, slime.getHp());

        assertEquals("B", poisonSlime.getSuffix());
        assertEquals(10, poisonSlime.getHp());

        // 공격력 테스트
        Hero hero = new Hero();
        slime.attack(hero);
        assertEquals(90, hero.getHp());

        poisonSlime.attack(hero);
        assertEquals(64, hero.getHp());

    }
}