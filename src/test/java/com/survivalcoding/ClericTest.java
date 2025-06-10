package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("자기 회복기를 사용.")
    void testSelfAid() {
//        준비 단계 : 객체를 생성 ---> Given
        Cleric cleric = new Cleric();

//        실행 단계 : 테스트하고자 하는 기능을 실행 ---> When
        cleric.selfAid();

//        검증 단계 : 기능의 결과를 확인함으로써 검증 ---> Then

        assertEquals(5, cleric.MP);
        assertEquals(50, cleric.HP);
    }

    @Test
    @DisplayName("'기도' 를 사용해 MP를 특정량만큼 회복.")
    void testPray() {
//        준비 단계 : 객체를 생성 ---> Given
        Cleric cleric = new Cleric();

//        실행 단계 : 테스트하고자 하는 기능을 실행 ---> When
        cleric.pray(500);

//        검증 단계 : 기능의 결과를 확인함으로써 검증 ---> Then
        assertEquals(10, cleric.MP);
    }
}