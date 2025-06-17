package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("자기 회복기를 사용.")
    void testSelfAid() {
//        준비 단계 1 : 객체를 생성 ---> Given
        Cleric cleric = new Cleric("Whitemane");
//        체력을 1로, 마나를 4로 설정
        cleric.setHP(1);
        cleric.setMP(4);

//        실행 단계 1 : 테스트하고자 하는 기능을 실행 ---> When
        cleric.selfAid();

//        검증 단계 1 : 기능이 작동 안했음을 확인 ---> Then
        assertEquals(1, cleric.getHP());
        assertEquals(4, cleric.getMP());

//        준비 단계 2 : 마나를 6으로 설정 ---> Given
        cleric.setMP(6);

//        실행 단계 : 테스트하고자 하는 기능을 실행 ---> When
//                  5 마나를 써서 1 마나가 되고, 6 체력이 최대인 50으로 바뀐다.
        cleric.selfAid();

//        검증 단계 2 : 기능의 결과를 확인함으로써 검증 ---> Then
        assertEquals(50, cleric.getHP());
        assertEquals(1, cleric.getMP());
    }

    @Test
    @DisplayName("'기도' 를 사용해 MP를 특정량만큼 회복.")
    void testPray() {
        Cleric cleric = new Cleric("Whitemane"); // cleric.
        int returnedMP = cleric.pray(3); // 3초를 기도했다고 가정.

//        case 1 :: 0 을 반환, 기본 MP가 최대이므로.
        assertEquals(0, returnedMP);
        assertEquals(10, cleric.getMP()); // MP기본값 10, MP 값에 결성이 생기지 않았는지 확인

//        case 2 :: 0 을 반환, 음수 시간동안은 기도할 수 없으므로.
        returnedMP = cleric.pray(-3);
        assertEquals(0, returnedMP);
        assertEquals(10, cleric.getMP()); // MP 값에 결성이 생기지 않았는지 확인

//        case 3 :: 회복량 3 ~ 5 를 반환하고, 마나가 5 ~ 8 인지 체크
//        초기 세팅
        int prayingSecond = 3; // 기도시간 설정
        int startMP = 2;
        cleric.setMP(startMP); // 초기값 변경

//        기도 시작
        returnedMP = cleric.pray(prayingSecond); // 값을 저장해야 해서 다시 사용하겠음

//        검증값 저장
//        총 MP가 예상범위 내인가?
//        (논리적으로) 보정을 못 받았으면 회복량 == 기도시간, 보정을 받았으면 회복량 = 보정받은 값
        boolean isMPInRange = cleric.getMP() >= startMP + prayingSecond && cleric.getMP() <= startMP + returnedMP;
        boolean isMPRegenInRange = returnedMP >= prayingSecond + 0 && returnedMP <= prayingSecond + 2;

//        검증하기
        assertTrue(isMPInRange);
        assertTrue(isMPRegenInRange);

//        case 4 :: 예상 회복량보다 실제 회복량이 적은 경우; 최대마나와 현재마나의 차이가 별로 나지 않을 때
//        '최대마나 - 현재마나 = 1' 로 가정하고 테스트
//        3초를 기도했지만, 모자란 마나가 1 밖에 되지 않아서 1만 차올라야 함
        startMP = 9;
        cleric.setMP(startMP);

        returnedMP = cleric.pray((prayingSecond));

        assertEquals(1, returnedMP);
    }

    @Test
    @DisplayName("Cleric's constructor test")
    void testClericConstructor(){
        Cleric sally = new Cleric("Whitemane", 40,5 );

        assertEquals("Whitemane", sally.getName());
        assertEquals(40, sally.getHP());
        assertEquals(5, sally.getMP());

        sally = new Cleric("Whitemane", 35);

        assertEquals("Whitemane", sally.getName());
        assertEquals(35, sally.getHP());
        assertEquals(10, sally.getMP());

        sally = new Cleric("Whitemane");

        assertEquals("Whitemane", sally.getName());
        assertEquals(50, sally.getHP());
        assertEquals(10, sally.getMP());
    }
}