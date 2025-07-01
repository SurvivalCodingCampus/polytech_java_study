package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Cleric cleric = new Cleric("아서스", 40, 10);

        int recoveredMp = cleric.pray(10);

        assertEquals(0, recoveredMp);
    }

    @Test
    void 클레릭_생성자_테스트() {
        Cleric cleric = new Cleric("아서스", 40, 5);

        assertEquals("아서스", cleric.name);
        assertEquals(40, cleric.hp);
        assertEquals(5, cleric.mp);

        cleric = new Cleric("아서스", 35);

        assertEquals("아서스", cleric.name);
        assertEquals(35, cleric.hp);
        assertEquals(Cleric.maxMp, cleric.mp);

        cleric = new Cleric("아서스");

        assertEquals("아서스", cleric.name);
        assertEquals(Cleric.maxHp, cleric.hp);
        assertEquals(Cleric.maxMp, cleric.mp);
    }
}