package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest extends Cleric{



    @Test
    @DisplayName("클래릭 생성시 설정한 이름으로 지정되어야 하고, MAX_HP / MAX_MP 로 설정되어야 한다")
    public void constructorTest(){
        //given
        String name = "z1존법사";
        //when
        Cleric cleric = new Cleric(name);

        //then
        Assertions.assertAll(
                () -> assertEquals(name, cleric.getName()),
                () -> assertEquals(Cleric.MAX_HP, cleric.getHp()),
                () -> assertEquals(Cleric.MAX_MP, cleric.getMp())
        );
    }

    @Test
    @DisplayName("MP가 5 감소해야하고 HP가 최대로 회복되어야 한다.")
    public void selfAid(){
        //given
        int hp = 10;
        int mp = 5;

        int useAmountMp = 5;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        testCleric.selfAid();
        //then
        Assertions.assertAll(
                () -> assertEquals(Cleric.MAX_HP, testCleric.getHp()),
                () -> assertEquals(mp - useAmountMp ,testCleric.getMp())
        );
    }
    @Test
    @DisplayName("MP가 5 미만인 경우 예외가 발생한다.")
    public void selfAidException(){
        //given
        int hp = 10;
        int mp = 0;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        //then
        Assertions.assertThrows(IllegalStateException.class, () -> testCleric.selfAid());
    }

    @Test
    @DisplayName("min - max 범위의 수가 나와야 한다.")
    public void getRandomNumber(){
        //given
        int min = 0;
        int max = 2;
        int repeat = 100;
        int[] intArr = new int[100];
        //when
        for(int i = 0; i < repeat; i++){
            int randomNumber = Cleric.getRandomNumber(min, max);
            intArr[i] = randomNumber;
        }
        //then
        for(int number : intArr){
            assertTrue(number >= min && number <= max);
        }
    }


    @Test
    @DisplayName("n초 기도시 MP 회복량은 n + min ~ n + max 값이여야한다.")
    public void pray(){
        //given
        int hp = 10;
        int mp = 0;
        int min = 0;
        int max = 2;
        int praySec = 3;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        int amount = testCleric.pray(praySec);

        //then
        Assertions.assertTrue(amount >= praySec + min && amount <= praySec + max);
    }

    @Test
    @DisplayName("mp 최대치 도달 시 예외가 발생해야한다.")
    public void prayException(){
        //given
        int hp = 10;
        int mp = 9;
        int praySec = 3;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        //then
        Assertions.assertThrows(IllegalStateException.class, () -> testCleric.pray(praySec));

    }


}