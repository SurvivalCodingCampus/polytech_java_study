package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("Cleric 생성")
    void test() {
        final Cleric cleric = new Cleric("Cleric1");
        assertEquals("Cleric1", cleric.name);
        assertEquals(cleric.maxHp, cleric.hp);
        assertEquals(cleric.maxMp, cleric.mp);
    }

    @Test
    @DisplayName("cleric.selfAid()")
    void selfAidTest() {
        final Cleric cleric = new Cleric("Cleric1");

        cleric.selfAid();

        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("cleric.pray()")
    void prayTest() {
        final Cleric cleric1 = new Cleric("Cleric1");
        cleric1.mp = 5;
        cleric1.pray(2);
        assertTrue(cleric1.mp >= 7 && cleric1.mp <=10 );
        final Cleric cleric2 = new Cleric("Cleric2");

        cleric2.mp = 9;
        cleric2.pray(3);
        assertEquals(10, cleric2.mp);

    }


}