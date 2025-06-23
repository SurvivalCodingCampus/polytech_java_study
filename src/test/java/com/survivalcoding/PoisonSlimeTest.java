package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoisonSlimeTest {

    @Test
    @DisplayName("독슬라임 이름 지어주기~")

    void poisonSlime(){

        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        //then
        assertEquals("A", poisonSlime.getSuffix());
    }

    @Test
    @DisplayName("독 카운터는 5인가?")

    void poisonSlime2(){

        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        //then
        assertEquals(5,poisonSlime.getPoisonCount());
    }

    @Test
    @DisplayName("추가로 독 포자를 살포하는가?")

    void poisonSlime3(){

        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero(100);
        //when
        poisonSlime.attack(hero);
        //then
        assertEquals(72, hero.getHp());
    }


    @Test
    @DisplayName("공격 이후 독 카운터가 1 줄었는가?")

    void poisonSlime4(){

        //given
        PoisonSlime poisonSlime = new PoisonSlime("A");
        Hero hero = new Hero(100);
        //when
        poisonSlime.attack(hero);
        //then
        assertEquals(4, poisonSlime.getPoisonCount());
    }



}