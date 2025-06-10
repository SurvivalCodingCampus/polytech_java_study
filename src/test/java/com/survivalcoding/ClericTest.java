package com.survivalcoding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("사제 생성시 hp는 50, mp는 10이다")
    void testCreate() {
        Cleric cleric = new Cleric();
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
        assertEquals("Cleric", cleric.name);
    }
    @Test
    @DisplayName("SelfAid 사용시 MP는 5가 깎이며 체력은 최대 체력으로 회복")
    void testSelfAid() {
        Cleric cleric = new Cleric();

        cleric.SelfAid();
        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);
    }
    @Test
    @DisplayName("Pray 사용시 자신의 MP를 회복한다")
    void testPray(){
        Cleric cleric = new Cleric();

        assertEquals(5, cleric.Pray(3));
        assertEquals(10, cleric.Pray(100));
    }
}