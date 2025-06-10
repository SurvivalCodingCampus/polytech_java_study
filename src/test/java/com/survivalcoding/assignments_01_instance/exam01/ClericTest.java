package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("MP가 최대일 경우 pray()는 0 반환하고 MP는 변하지 않아야 한다")
    void testPrayMPMax(){
        //given
        Cleric cleric = new Cleric("Test");
        cleric.MP = Cleric.MAX_MP;

        //when
        int  result = cleric.pray(2);

        //then
        assertEquals(0, result);
        assertEquals(Cleric.MAX_MP, cleric.MP);
    }

    @Test
    @DisplayName("기도 시간이 0이하일 경우 MP는 변하지 않고 0이 반환되어야 한다")
    void testPrayTimeZero(){
        //given
        Cleric cleric = new Cleric("Test");
        cleric.MP = 5;

        //when
        int result = cleric.pray(0);

        //then
        assertEquals(0, result);
        assertEquals(5, cleric.MP);
    }

}

