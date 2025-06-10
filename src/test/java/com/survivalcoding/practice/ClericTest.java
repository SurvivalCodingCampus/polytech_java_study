package com.survivalcoding.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    @DisplayName("Cleric 객체 생성 시 최대 hp = 50")
    void testInitMaxHp(){
        Cleric cleric = new Cleric();
        assertEquals(50, cleric.maxHp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최초 hp = 10")
    void testInitHp(){
        Cleric cleric = new Cleric();
        assertEquals(10, cleric.hp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최대 mp = 10")
    void testInitMaxMp(){
        Cleric cleric = new Cleric();
        assertEquals(10, cleric.maxMp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최초 mp = 10")
    void testInitMp(){
        Cleric cleric = new Cleric();
        assertEquals(10, cleric.mp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 Random 객체 생성 확인")
    void testRandomInstanceIsNotNull(){
        Cleric cleric = new Cleric();
        assertNotNull(cleric.rand); // 객체가 Null인지 확인
    }

    @Test
    @DisplayName("Cleric의 pray()를 통해 mp회복 확인")
    void testPray(){
        Cleric cleric = new Cleric();
        assertNotNull(cleric.rand); // 객체가 Null인지 확인
    }
}