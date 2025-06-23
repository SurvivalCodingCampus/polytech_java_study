package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class SlimeTest {
    PoisonSlime poisonslime = new PoisonSlime("A");

    @Test
    @DisplayName("PoisonSlime 객체가 올바르게 생성되는지")
    void testCreate() {
        // then
        assertEquals("A", poisonslime.getSuffix());
    }

    @Test
    @DisplayName("PoisonSlime의 attack 메서드 확인")
    void testAttack() {
        // given
        Hero hero = new Hero();
        int initHp = hero.getHp();
        int notPoisionHp = initHp - 10;
        int poisionHp = notPoisionHp - notPoisionHp / 5;

        // when
        poisonslime.attack(hero);

        // then
        // 1. 독에 적용된 후의 hp 측정 & 독이 적용 되기 전의 hp 측정
        assertEquals(hero.getHp(), poisionHp);
        assertEquals(notPoisionHp, poisionHp + notPoisionHp / 5);
    }
}
