package com.survivalcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {
    PoisonSlime poisonSlime;
    Hero hero;

    @BeforeEach
    void setUp()
    {
        poisonSlime = new PoisonSlime("A");
        hero = new Hero("홍길동", 10);
    }

    @Test
    void attack() {
        assertEquals(PoisonSlime.Default_Poison_Count, poisonSlime.getPoisonCount());

        for(int i = 0;i < PoisonSlime.Default_Poison_Count;i++)
        {
            poisonSlime.attack(hero);
        }

        assertEquals(0, poisonSlime.getPoisonCount());

        Hero hero1 = new Hero("김씨", 100);
        int expectedHeroHp = hero1.getHp() - PoisonSlime.Default_Damage;

        poisonSlime.attack(hero1);
        assertEquals(expectedHeroHp, hero1.getHp());
    }
}