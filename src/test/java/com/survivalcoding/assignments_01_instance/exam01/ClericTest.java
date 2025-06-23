package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {
    @Test
    @DisplayName("Cleric 생성")
    void test() {
        final Cleric cleric1 = new Cleric("Cleric1", 40, 5);
        assertEquals("Cleric1", cleric1.name);
        assertEquals(40, cleric1.hp);
        assertEquals(5, cleric1.mp);

        final Cleric cleric2 = new Cleric("Cleric2", 35);
        assertEquals("Cleric2", cleric2.name);
        assertEquals(35, cleric2.hp);
        assertEquals(Cleric.maxMp, cleric2.mp);

        final Cleric cleric3 = new Cleric("Cleric3");
        assertEquals("Cleric3", cleric3.name);
        assertEquals(Cleric.maxHp, cleric3.hp);
        assertEquals(Cleric.maxMp, cleric3.mp);
    }

//    @Test
//    @DisplayName("cleric.selfAid()")
//    void selfAidTest() {
//        final Cleric cleric1 = new Cleric("Cleric1");
//
//        cleric1.hp = 50;
//        cleric1.selfAid();
//        assertEquals(50, cleric1.hp);
//        assertEquals(5, cleric1.mp);
//
//        final Cleric cleric2 = new Cleric("Cleric2");
//        cleric2.hp = 10;
//        cleric2.mp = 2;
//        assertEquals(10, cleric2.hp);
//        assertEquals(2, cleric2.mp);
//    }
//
//    @Test
//    @DisplayName("cleric.pray()")
//    void prayTest() {
//        final Cleric cleric1 = new Cleric("Cleric1");
//        cleric1.mp = 5;
//        cleric1.pray(2);
//        assertTrue(cleric1.mp >= 7 && cleric1.mp <= 9 );
//
//        final Cleric cleric2 = new Cleric("Cleric2");
//        cleric2.mp = 9;
//        cleric2.pray(3);
//        assertEquals(10, cleric2.mp);
//
//        final Cleric cleric3 = new Cleric("Cleric3");
//        cleric3.mp = 3;
//        cleric3.pray(0);
//        assertEquals(3, cleric3.mp);
//
//    }


}