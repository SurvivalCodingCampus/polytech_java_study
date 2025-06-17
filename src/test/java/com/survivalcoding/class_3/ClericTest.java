package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClericTest {

    @Test
    @DisplayName("mp -5, hp 50이 되어야 한다")
    void selfAid() {
        Cleric cleric = new Cleric("홍길동");
        cleric.selfAid();
        assertEquals(50,cleric.hp);

        assertEquals(5,cleric.mp);
    }

    @Test
    @DisplayName("mp는 10이 되어야 한다")
    void pray() {
        Cleric cleric = new Cleric("홍길동");
        cleric.selfAid();
        assertEquals(50,cleric.hp);
        assertEquals(5,cleric.mp);

        cleric.pray(6);
        assertEquals(10,cleric.mp);
    }

    @Test
    @DisplayName("생성자 초기화를 확인한다")
    void create(){
        Cleric cleric1 = new Cleric("홍길동", 10, 3);
        assertEquals("홍길동",cleric1.name);
        assertEquals(10,cleric1.hp);
        assertEquals(3,cleric1.mp);

        Cleric cleric2 = new Cleric("동동이", 10);
        assertEquals("동동이",cleric2.name);
        assertEquals(10,cleric2.hp);
        assertEquals(10,cleric2.mp);

        Cleric cleric3 = new Cleric("동동이");
        assertEquals("동동이",cleric3.name);
        assertEquals(50,cleric3.hp);
        assertEquals(10,cleric3.mp);
    }
}