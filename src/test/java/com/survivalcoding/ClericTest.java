package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    //준비
    // 실행
    //검증
    @Test
    @DisplayName("생성자 a")
    void TestA() {
        Cleric cleric = new Cleric("아서스", 40, 5);
    }

    @Test
    @DisplayName("생성자 b")
    void TestB() {
        Cleric cleric = new Cleric("아서스", 35);
    }

    @Test
    @DisplayName("생성자 c")
    void TestC() {
        Cleric cleric = new Cleric("아서스");
    }


    @Test
    @DisplayName("MP사용시 MP가 -5감소하고, HP MAX 된다.")
    void Test2() {
        Cleric cleric = new Cleric("아서스");

        cleric.selfAid();

        assertEquals(5, cleric.hp);
        assertEquals(-5, cleric.mp);
    }

    @Test
    @DisplayName("pray 사용시 자신의 MP 5증가한다.")
    void Test3() {
        Cleric cleric = new Cleric("아서스");

        cleric.pray();

        assertEquals(2, cleric.mp);

    }
}