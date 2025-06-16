package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("selfAid()를 하면 mp-5 하면 hp = maxhp가 된다")
    void testSelfAid() {

        //given(준비)
        final Cleric cleric = new Cleric("성직자");

        //when(실행)
        cleric.mp = 5;
        cleric.selfAid();
        //then(검증)
        assertEquals(50, cleric.hp);
    }

    @Test
    @DisplayName("pray 확인")
    void testPray() { // test01 : 시간 초가 랜덤으로 잘 들어가는지
        //given(준비)
        final Cleric cleric01 = new Cleric("성직자");
        //when(실행)
        cleric01.mp = 5;
        int value = cleric01.pray(3);//maxmp =10
        //then(검증)
        assertTrue(cleric01.mp <= 10 && cleric01.mp >= 8);

        // test02 : 시간 초가 10일 때, mp = maxmp 가 나오는지
        //given(준비)
        final Cleric cleric02 = new Cleric("성직자");
        //when(실행)
        cleric02.mp = 5;
        cleric02.pray(10);//maxmp =10
        //then(검증)
        assertEquals(10, cleric02.mp);
    }

    @Test
    @DisplayName("(A) 문제 테스트")
    void testA() {
        //given(준비)
        final Cleric cleric = new Cleric("아서스", 40, 5);
        //when(실행)
        //then(검증)
        assertEquals("아서스", cleric.name);
        assertEquals(40, cleric.hp);
        assertEquals(5, cleric.mp);
        //assertTrue(cleric.hp == 40);
    }

    @Test
    @DisplayName("(B) 문제 테스트")
    void testB() {
        //given(준비)
        final Cleric cleric = new Cleric("아서스", 35);
        //when(실행)
        //then(검증)
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("(C) 문제 테스트")
    void testC() {
        //given(준비)
        final Cleric cleric = new Cleric("아서스");
        //when(실행)
        //then(검증)
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
    }


}