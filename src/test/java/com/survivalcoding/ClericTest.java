package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid(){


        //given(준비)
        Cleric cleric = new Cleric();
        cleric.hp=0;

        //when(실행)
        cleric.selfAid();

        //tnen

        assertEquals(50,cleric.hp);
    }


    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid2(){


        //given(준비)
        Cleric cleric = new Cleric();
        cleric.hp=5;

        //when(실행)
        cleric.selfAid();

        //tnen

        assertEquals(50,cleric.hp);
    }


    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid3(){


        //given(준비)
        Cleric cleric = new Cleric();
        cleric.hp=5;

        //when(실행)
        cleric.selfAid();

        //tnen

        assertEquals(5,cleric.mp);
    }


    @Test
    @DisplayName("랜덤 0~2 포인트, mp 회복량ㄱ")
    void pray1(){


        //given(준비)
        Cleric cleric = new Cleric();
        cleric.mp = 0;

        //when(실행)
        cleric.pray(3);

        //tnen

        assertEquals(3,cleric.mp);
    }

    @Test
    @DisplayName("랜덤 0~2 포인트, mp 회복량ㄱ")
    void pray2(){


        //given(준비)
        Cleric cleric = new Cleric();
        cleric.mp = 9;

        //when(실행)
        cleric.pray(2);

        //tnen

        assertEquals(10,cleric.mp);
    }



}