package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClericTest {

    @Test
    @DisplayName("mp -5, hp 50이 되어야 한다")
    void selfAid() {
        Cleric cleric = new Cleric();
        cleric.selfAid();
        assertEquals(50,cleric.hp);

        assertEquals(5,cleric.mp);
    }

    @Test
    @DisplayName("mp는 10이 되어야 한다")
    void pray() {
        Cleric cleric = new Cleric();
        cleric.selfAid();
        assertEquals(50,cleric.hp);
        assertEquals(5,cleric.mp);

        cleric.pray(6);
        assertEquals(10,cleric.mp);
    }
}