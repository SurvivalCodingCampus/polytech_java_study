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
//        5 마나를 써서 0 마나가 되고, 20 체력이 최대인 50으로 바뀐다.
        cleric.selfAid();

//        검증 단계 : 기능의 결과를 확인함으로써 검증 ---> Then
        assertEquals(0, cleric.getMP());
        assertEquals(50, cleric.getHP());
    }

    @Test
    @DisplayName("'기도' 를 사용해 MP를 특정량만큼 회복.")
    void testPray() {
//        준비 단계 : 객체를 생성 ---> Given
        Cleric cleric = new Cleric();

//        실행 단계 : 테스트하고자 하는 기능을 실행 ---> When
//        3초를 기도한다 ---> 3 ~ 5 가 차올라야 한다
        int resultMP = cleric.pray(3);
        boolean isMPInRange;

        isMPInRange = resultMP >= 8 && resultMP <= 10;

//        검증 단계 : 기능의 결과를 확인함으로써 검증 ---> Then
//        5 마나 ---> 8 ~ 10 마나?
        assertTrue(isMPInRange);
    }
}