package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    void testselfAid()
    {
        Cleric cleric = new Cleric("아서스", 40, 5);

        cleric.selfAid();

        assertEquals(50, cleric.Hp);
    }

    @Test
    void testprey()
    {
        Cleric cleric = new Cleric("아서스", 40, 5);

        int Mp = cleric.prey(1);

        assertEquals(10, cleric.Mp);
    }

    @Test
    void 이름_Hp_Mp()
    {
        Cleric cleric = new Cleric("아서스", 40, 5);

        assertEquals("아서스", cleric.name);
        assertEquals(40, cleric.Hp);
        assertEquals(5, cleric.Mp);


    }
}