package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Hero;
import com.survivalcoding.assignments_01_instance.exam01.Monster.PoisonSlime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {
    PoisonSlime poisonSlime;
    Hero hero;

    @BeforeEach
    void setUp(){
        poisonSlime=new PoisonSlime("A");
        hero=new Hero("홍길동", 10);
    }

    @Test
    @DisplayName("독 공격 횟수 테스트")
    void attack() {
        assertEquals(PoisonSlime.DEFAULT_POISON_COUNT, poisonSlime.getPoisonCount());

        for (int i = 0; i < PoisonSlime.DEFAULT_POISON_COUNT; i++) {
            poisonSlime.attack(hero);
        }

        assertEquals(0, poisonSlime.getPoisonCount());

        // 한 번 더 공격
        poisonSlime.attack(hero);
        assertEquals(0, poisonSlime.getPoisonCount());
    }
    @Test
    @DisplayName("일반 데미지 확인")
    void attack2() {
        assertEquals(PoisonSlime.DEFAULT_POISON_COUNT, poisonSlime.getPoisonCount());

        for (int i = 0; i < PoisonSlime.DEFAULT_POISON_COUNT; i++) {
            poisonSlime.attack(hero);
        }

        assertEquals(0, poisonSlime.getPoisonCount());

        // 한 번 더 공격해서 일반 데미지 확인
        Hero hero1 = new Hero("김씨", 100);
        int expectedHeroHp = hero1.getHp() - PoisonSlime.DEFAULT_DAMAGE;

        poisonSlime.attack(hero1);
        assertEquals(expectedHeroHp, hero1.getHp());
    }

    @Test
    @DisplayName("독 공격 확인")
    void attack3() {
        assertEquals(PoisonSlime.DEFAULT_POISON_COUNT, poisonSlime.getPoisonCount());

        for (int i = 0; i < PoisonSlime.DEFAULT_POISON_COUNT; i++) {
            Hero hero1 = new Hero("실험체", 100);
            int expectedHeroHp = hero1.getHp() - PoisonSlime.DEFAULT_DAMAGE;

            poisonSlime.attack(hero1);

            assertNotEquals(expectedHeroHp, hero1.getHp());
            assertTrue(expectedHeroHp > hero1.getHp());
        }

        assertEquals(0, poisonSlime.getPoisonCount());
    }
}