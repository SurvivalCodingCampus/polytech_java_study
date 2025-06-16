package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    void selfAid() {
    }

    // MP가 꽉 찼을 때는 회복량 0
    // MP가 적을 때는 회복되어야 함
    // sec 가 0 이하면 그냥 0 리턴

    @Test
    @DisplayName("MP가 꽉 찼을 때는 회복량 0")
    void pray() {
        // MP가 꽉
        Cleric cleric = new Cleric();

        int recoveredMp = cleric.pray(10);

        assertEquals(0, recoveredMp);
    }

    @Test
    @DisplayName("MP가 0일 때 회복되어야 함")
    void pray2() {
        // MP 적게
        Cleric cleric = new Cleric();
        cleric.mp = 0;

        int recoveredMp = cleric.pray(1);   // 1 ~ 3

        assertTrue(recoveredMp >= 1);
        assertTrue(recoveredMp <= 3);

        cleric.mp = 0;

        recoveredMp = cleric.pray(8);   // 8 ~ 11

        assertTrue(recoveredMp >= 8);
        assertTrue(recoveredMp <= 11);
        assertTrue(recoveredMp <= cleric.maxMp);
    }

    @Test
    @DisplayName("MP가 5일 때 회복되어야 함")
    void pray3() {
        // MP 적게
        Cleric cleric = new Cleric();
        cleric.mp = 5;

        int recoveredMp = cleric.pray(1);   // 6 ~ 8
        System.out.println(recoveredMp);

        assertTrue(cleric.mp >= 6);
        assertTrue(cleric.mp <= 8);

        cleric.mp = 5;

        recoveredMp = cleric.pray(8);   // 8 ~ 11

        assertEquals(5, recoveredMp);
    }

    public static void main(String[] args)
    {
        Cleric cleric = new Cleric();
    }
}