package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("사제 생성시 hp는 50, mp는 10이다")
    void testCreate() {
        Cleric cleric = new Cleric("아서스");  // 초기화 테스트
        assertEquals(50, cleric.hp);
        assertEquals(50, Cleric.clericMaxHp);
        assertEquals(10, cleric.mp);
        assertEquals(10, Cleric.clericMaxMp);
        assertEquals("아서스", cleric.name);

        Cleric cleric_1 = new Cleric("아서스",40);  // 초기화 테스트
        assertEquals(40, cleric_1.hp);
        assertEquals(50, Cleric.clericMaxHp);
        assertEquals(10, cleric_1.mp);
        assertEquals(10, Cleric.clericMaxMp);
        assertEquals("아서스", cleric_1.name);

        Cleric cleric_2 = new Cleric("아서스",40, 5);  // 초기화 테스트
        assertEquals(40, cleric_2.hp);
        assertEquals(50, Cleric.clericMaxHp);
        assertEquals(5, cleric_2.mp);
        assertEquals(10, Cleric.clericMaxMp);
        assertEquals("아서스", cleric_2.name);

    }


    @Test
    @DisplayName("SelfAid 사용시 MP는 5가 깎이며 체력은 최대 체력으로 회복")
    void testSelfAid() {
        Cleric cleric = new Cleric("아서스", 1, 10);// 일반적인 상황에서의 SelfAid
        cleric.selfAid();
        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);

        Cleric cleric_1 = new Cleric("아서스", 31, 4); // MP가 부족할경우 SelfAid가 사용되지않음
        cleric_1.selfAid();
        assertEquals(31, cleric_1.hp);
        assertEquals(4, cleric_1.mp);

        Cleric cleric_2 = new Cleric("아서스", 50, 10);// SelfAid HP가 만땅일경우 MP만 소모
        cleric_2.selfAid();
        assertEquals(50, cleric_2.hp);
        assertEquals(5, cleric_2.mp);

    }

    @Test
    @DisplayName("Pray 사용시 자신의 MP를 회복한다")
    void testPray() {

        Cleric cleric = new Cleric("아서스",50,0);
        assertEquals(0, cleric.pray(0));  // 0초 Pray시 0회복
        assertEquals(0, cleric.mp);

        Cleric cleric_1 = new Cleric("아서스",50,0);
        assertEquals(5, cleric_1.pray(3));  // Pray 3초의 경우 3~5 난수값 회복
        assertEquals(5, cleric_1.mp);

        Cleric cleric_2 = new Cleric("아서스",50,0);
        assertEquals(10, cleric_2.pray(15));  // 최대 10까지 만 회복함
        assertEquals(10, cleric_2.mp);

        Cleric cleric_3 = new Cleric("아서스",50,10);
        assertEquals(0, cleric_3.pray(3));  //  이미 mp가 만땅의 경우 0회복
        assertEquals(10, cleric_3.mp);

    }
}

