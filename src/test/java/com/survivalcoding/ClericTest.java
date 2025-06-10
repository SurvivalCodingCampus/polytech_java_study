package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

class ClericTest {
    @Test @DisplayName("selfAid()를 하면 mp-5 하면 hp = maxhp가 된다")
    void testselfAid(){

        //given(준비)
        final Cleric cleric = new Cleric("성직자");

        //when(실행)
        cleric.mp = 5;
        cleric.selfAid();
        //then(검증)
        assertEquals(50,cleric.hp);
    }

    @Test
    @DisplayName("pray 확인")
    void testpray() {


        // test01 : 시간 초가 랜덤으로 잘 들어가는지
        //given(준비)
        final Cleric cleric01 = new Cleric("성직자");
        //when(실행)
        cleric01.mp = 5;
        cleric01.pray(3);//maxmp =10
        //then(검증)
        assertTrue(cleric01.mp <=10 && cleric01.mp<=8);

        // test02 : 시간 초가 10일 때, mp = maxmp 가 나오는지
        //given(준비)
        final Cleric cleric02 = new Cleric("성직자");
        //when(실행)
        cleric01.mp = 5;
        cleric02.pray(10);//maxmp =10
        //then(검증)
        assertEquals(10,cleric02.mp);




    }

}