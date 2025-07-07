package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatWizardTest {
    Hero hero;

    @BeforeEach
    void setUp()
    {
        Hero hero = new Hero("홍길동", 50);
    }

    @Test
    void heal() {
        GreatWizard.mp = 10;

        assertEquals(70, hero.getHp());
    }

    @Test
    void superHeal() {
    }
}