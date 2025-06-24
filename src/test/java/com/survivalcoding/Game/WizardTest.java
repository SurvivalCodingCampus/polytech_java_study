package com.survivalcoding.Game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WizardTest {

    @Test
    @DisplayName("마법사, 지팡이 생성 테스트 및 힐테스트")
    void testWizard() {
        Wand wand = new Wand("지팡이", 50);
        Wizard wizard = new Wizard(50, 100, "마법사", wand);
        assertEquals(50, wizard.getHp());
        assertEquals(100, wizard.getMp());
        assertEquals("마법사", wizard.getName());
        assertEquals(50, wizard.getWand().getPower());
        assertEquals("지팡이", wizard.getWand().getName());

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("펑");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });

        wizard.setHp(-1);
        assertEquals(0, wizard.getHp());

        Hero hero = new Hero("김숙자", 50);
        int initialHp = hero.getHp();
        wizard.heal(hero);
        assertEquals(90, wizard.getMp());
        assertEquals(initialHp + 20, hero.getHp()); // 힐 효과 확인

        wizard.setMp(5);
        int hpBeforeFailedHeal = hero.getHp();
        wizard.heal(hero);
        assertEquals(5, wizard.getMp());
        assertEquals(hpBeforeFailedHeal, hero.getHp()); // HP 변화 없음 확인


    }


}