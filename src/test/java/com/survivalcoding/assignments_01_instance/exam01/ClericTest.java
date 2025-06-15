package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest extends Cleric {


    @Test
    @DisplayName("클래릭 생성시 설정한 이름으로 지정되어야 하고, MAX_HP / MAX_MP 로 설정되어야 한다")
    void constructorTest() {
        //given
        String name = "z1존법사";
        //when
        Cleric cleric = new Cleric(name);

        //then
        assertEquals(name, cleric.getName());
        assertEquals(Cleric.MAX_HP, cleric.getHp());
        assertEquals(Cleric.MAX_MP, cleric.getMp());
    }

    @Test
    @DisplayName("클래릭 생성시 이름이 공백이거나 NULL 인경우 예외가 발생한다.")
    void constructorException() {
        //give//when//then
        assertThrows(RuntimeException.class, () -> new Cleric(null));
        assertThrows(RuntimeException.class, () -> new Cleric("    "));
    }

    @Test
    @DisplayName("MP가 5 감소해야하고 HP가 최대로 회복되어야 한다.")
    void elfAid() {
        //given
        int hp = 10;
        int mp = 5;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        testCleric.selfAid();
        //then
        assertEquals(Cleric.MAX_HP, testCleric.getHp());
        assertEquals(0, testCleric.getMp());
    }

    @Test
    @DisplayName("MP가 5 미만인 경우 예외가 발생한다.")
    void selfAidException() {
        //given
        int hp = 10;
        int mp = 0;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        //then
        Assertions.assertThrows(IllegalStateException.class, testCleric::selfAid);
    }

    @Test
    @DisplayName("min - max 범위의 수가 나와야 한다.")
    void getRandomNumber() {
        //given
        int min = 0;
        int max = 2;
        int repeat = 100;
        int[] intArr = new int[100];
        //when
        for (int i = 0; i < repeat; i++) {
            int randomNumber = Cleric.getRandomNumber(min, max);
            intArr[i] = randomNumber;
        }
        //then
        for (int number : intArr) {
            assertTrue(number >= min && number <= max);
        }
    }


    @Test
    @DisplayName("n초 기도시 MP 회복량은 n + min ~ n + max 값이여야한다.")
    void pray() {
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
        Assertions.assertTrue(testCleric.getMp() >= mp);
    }


    @Test
    @DisplayName("mp 최대치 도달 시 회복된 만큼만 반환되어야 한다.")
    void prayFullCharging() {
        //given
        int hp = 10;
        int mp = 9;
        int praySec = 3;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        int result = testCleric.pray(praySec);
        //then
        Assertions.assertEquals(MAX_MP, testCleric.getMp());
        Assertions.assertEquals(MAX_MP - mp, result);
    }

    @Test
    @DisplayName("mp가 이미 최대치 인경우 예외가 발생한다.")
    void prayException() {
        //given
        int hp = 10;
        int praySec = 3;

        Cleric testCleric = new Cleric("test", hp, MAX_MP);

        //when //then
        Assertions.assertThrows(RuntimeException.class, () -> testCleric.pray(praySec));
    }

    @Test
    @DisplayName("sec이 0이나 음수일 경우 예외가 발생해야한다.")
    void prayExceptionForSec() {
        //given
        int hp = 10;
        int mp = 9;

        Cleric testCleric = new Cleric("test", hp, mp);

        //when
        //then
        Assertions.assertThrows(IllegalStateException.class, () -> testCleric.pray(-3));
        Assertions.assertThrows(IllegalStateException.class, () -> testCleric.pray(0));
    }


}