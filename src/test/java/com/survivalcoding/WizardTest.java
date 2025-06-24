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

    @Test
    @DisplayName("그레이트 위자드의 힐이 정상 작동하는가?")

    void GreatWizard1(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100,100);
        Hero hero = new Hero(75);
        //when
        greatWizard.heal(hero);
        //then
        assertEquals(100, hero.getHp());
    }

    @Test
    @DisplayName("그레이트 위자드의 mp도 정상 깎이는가?")

    void GreatWizard2(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100,100);
        Hero hero = new Hero(75);
        //when
        greatWizard.heal(hero);
        //then
        assertEquals(145, greatWizard.getMp());
    }


    @Test
    @DisplayName("그레이트 위자드의 super힐이 정상 작동하는가?")

    void GreatWizard3(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100,100);
        Hero hero = new Hero(50);
        //when
        greatWizard.superHeal(hero);
        //then
        assertEquals(100, hero.getHp());
    }

    @Test
    @DisplayName("그레이트 위자드의 superHeal mp도 정상 깎이는가?")

    void GreatWizard4(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100,100);
        Hero hero = new Hero(75);
        //when
        greatWizard.superHeal(hero);
        //then
        assertEquals(50, greatWizard.getMp());
    }

    @Test
    @DisplayName("그레이트 위자드의 mp가 부족하면 경고가 뜨는가?")

    void GreatWizard5(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100, 2);
        Hero hero = new Hero(75);
        //then
        assertThrows(IllegalArgumentException.class, ()->{
            greatWizard.heal(hero);
        });
    }


    @Test
    @DisplayName("그레이트 위자드의 mp가 부족하면 경고가 뜨는가?")

    void GreatWizard6(){

        //given
        GreatWizard greatWizard = new GreatWizard("류쿠", 100, 2);
        Hero hero = new Hero(75);
        //then
        assertThrows(IllegalArgumentException.class, ()->{
            greatWizard.superHeal(hero);
        });
    }

}