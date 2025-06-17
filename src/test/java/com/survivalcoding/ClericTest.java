package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    void testselfAid()
    {
        Cleric cleric = new Cleric(String name, int Hp, int Mp);

        cleric.selfAid();

        assertEquals(50, cleric.Hp);
    }

    @Test
    void testprey()
    {
        Cleric cleric = new Cleric(String name, int Hp, int Mp);

        cleric.prey(1);

        assertEquals(10, cleric.Mp);
    }
}