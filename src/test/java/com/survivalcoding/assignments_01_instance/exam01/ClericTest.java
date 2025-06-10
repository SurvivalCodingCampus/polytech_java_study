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

        cleric.selfAid();

        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);

        cleric.pray(2);
        assertTrue(cleric.mp >= 7 && cleric.mp <=10 );

    }
}