package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid(){


        //given(준비)
        Cleric cleric1 = new Cleric("아서스");
        cleric1.hp=0;

        //when(실행)
        cleric1.selfAid();

        //tnen

        assertEquals(50,cleric1.hp);
    }


    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid2(){


        //given(준비)
        Cleric cleric2 = new Cleric("아서스");
        cleric2.hp=5;

        //when(실행)
        cleric2.selfAid();

        //tnen

        assertEquals(50,cleric2.hp);
    }


    @Test
    @DisplayName("mp 5를 소모하면 HP기 50이 되어야 한다")
    void selfAid3(){


        //given(준비)
        Cleric cleric = new Cleric("아서스");
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
        Cleric cleric = new Cleric("아서스");
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
        Cleric cleric = new Cleric("아서스");
        cleric.mp = 9;

        //when(실행)
        cleric.pray(2);

        //tnen

        assertEquals(10,cleric.mp);
    }


    @Test
    @DisplayName("아서스, 40,5")

    void clericTest() {

        Cleric cleric =  new Cleric("아서스",40,5);
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);


    }

    @Test
    @DisplayName("아서스, 35,maxMP")

    void clericTest2() {

        Cleric cleric =  new Cleric("아서스",40);
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);

    }

    @Test
    @DisplayName("아서스,maxHP,maxMP")

    void clericTest3() {

        Cleric cleric =  new Cleric("아서스");
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);

    }

    @Test
    @DisplayName("이름이 없는 생성자는 인스턴스화 할 수 없다")

    void clericTest4() {

        Cleric cleric =  new Cleric("이름을 넣을 수 없음을 확인함");
        System.out.println(cleric.name);
        System.out.println(cleric.hp);
        System.out.println(cleric.mp);

    }

    @Test
    @DisplayName("마법사와 지팡이의 이름은 null일 수 없다")
    void Wand_Wizard_tests(){

        Wand wand = new Wand();

        assertThrows(IllegalAccessException.class, ()->{
            Wand.setName()
        })
    }


}