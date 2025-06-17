package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WizardTest {
    @Test
    @DisplayName("Wizard 객체 생성 시 올바르게 생성되는지")
    void testCreate() {
        // given, when
        Wizard wizard = new Wizard(50, 10, "아서스", new Wand());

        // then
        assertEquals(50, wizard.getHp());
        assertEquals(10, wizard.getMp());
        assertEquals("아서스", wizard.getName());
        assertEquals("기본지팡이", wizard.getWand().getName());
        assertEquals(10.f, wizard.getWand().getPower());
    }

    @Test
    @DisplayName("각 필드들의 getter, setter 테스트")
    void testGetterSetter() {
        /*--------1. getter--------*/
        // given
        Wizard wizard = new Wizard(50, 10, "아서스", new Wand());

        // when
        int testHp = wizard.getHp();
        int testMp = wizard.getMp();
        String testName = wizard.getName();
        Wand testWand = wizard.getWand();

        // then
        assertEquals(50, testHp);
        assertEquals(10, testMp);
        assertEquals("아서스", testName);
        assertTrue(testWand != null);

        /*--------2. setter--------*/
        // when
        wizard.setHp(10);
        wizard.setMp(1);
        wizard.setName("제이나");
        wizard.setWand(new Wand());

        // then
        assertEquals(10, wizard.getHp());
        assertEquals(1, wizard.getMp());
        assertEquals("제이나", wizard.getName());
        assertTrue(wizard.getWand() != null);

        // wizzard class에서 hp가 0보다 작으면 hp를 0으로 설정하게 해뒀으니 오류 발생
        /*assertThrows(IllegalArgumentException.class, () -> {
            wizard.setHp(-100);
        });*/

        // mp가 0보다 작을 때는 오류 발생 -> 성공
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });

        /*--------2. wizard의 heal 메서드 테스트--------*/
        // given
        Hero hero = new Hero();
        Wizard wizard1 = new Wizard(50, 10, "제이나", new Wand());
        int beforeHp = hero.getHp();

        // when
        wizard1.heal(hero);

        // then
        assertEquals(hero.getHp(), hero.getMp() + 10 * wizard1.getWand().getPower());
    }
}
