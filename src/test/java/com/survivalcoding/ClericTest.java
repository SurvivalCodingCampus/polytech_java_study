package com.survivalcoding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("사제 생성시 hp는 50, mp는 10이다")
    void testCreate() {
        Cleric cleric = new Cleric();  // 초기화 테스트
        assertEquals(50, cleric.hp);
        assertEquals(50, cleric.maxHp);
        assertEquals(10, cleric.mp);
        assertEquals(10, cleric.maxMp);
        assertEquals("Cleric", cleric.name);
    }
    @Test
    @DisplayName("SelfAid 사용시 MP는 5가 깎이며 체력은 최대 체력으로 회복")
    void testSelfAid() {
        Cleric cleric = new Cleric();

        cleric.hp = 1;  // 일반적인 상황에서의 SelfAid
        cleric.SelfAid();
        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);

        cleric.mp = 4;  // MP가 부족할경우 SelfAid가 사용되지않음
        cleric.hp = 31;
        cleric.SelfAid();
        assertEquals(31, cleric.hp);
        assertEquals(4, cleric.mp);

        cleric.mp = 10;  // SelfAid HP가 만땅일경우 MP만 소모
        cleric.hp = 50;
        cleric.SelfAid();
        assertEquals(50, cleric.hp);
        assertEquals(5, cleric.mp);

    }
    @Test
    @DisplayName("Pray 사용시 자신의 MP를 회복한다")
    void testPray(){

        Cleric cleric = new Cleric();

        cleric.mp = 0;
        assertEquals(0, cleric.Pray(0));  // 0초 Pray시 0회복

        cleric.mp = 0;
        assertEquals(5, cleric.Pray(3));  // Pray 3초의 경우 3~5 난수값 회복

        cleric.mp = 0;
        assertEquals(10, cleric.Pray(15));  // 최대 10까지 만 회복함

        cleric.mp = 10;
        assertEquals(0, cleric.Pray(3));  //  이미 mp가 만땅의 경우 0회복

    }
}