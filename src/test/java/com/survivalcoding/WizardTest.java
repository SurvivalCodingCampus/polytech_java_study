package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    @DisplayName("히어로의 hp가 20이 올라가는가?")

    void Wizard1(){

        //given
        Wizard wizard = new Wizard("자이리톨", 100);
        Hero hero = new Hero(80);
        //when
        wizard.heal(hero);
        //then
        assertEquals(100, hero.getHp());
    }

    @Test
    @DisplayName("위자드의 mp가 10 소모 됐는가?")

    void Wizard2(){

        //given
        Wizard wizard = new Wizard("이블리나", 100);
        Hero hero = new Hero(80);
        //when
        wizard.heal(hero);
        //then
        assertEquals(90, wizard.getMp());
    }

    @Test
    @DisplayName("위자드의 mp가 부족하면 경고가 뜨는가?")

    void Wizard3(){

        //given
        Wizard wizard = new Wizard("아리타", 100, 8);
        Hero hero = new Hero(80);
        //when
      assertThrows(IllegalArgumentException.class, ()->{
         wizard.heal(hero);
      });
    }

}