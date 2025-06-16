package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("생성자 테스트1")
    void constructorTest1() {
        //given and when
        Cleric cleric = new Cleric("깃허브");

        assertEquals("깃허브", cleric.name);
        assertEquals(50, cleric.currentHp);
        assertEquals(10, cleric.currentMp);
    }

    @Test
    @DisplayName("생성자 테스트2")
    void constructorTest2() {
        //given and when
        Cleric cleric = new Cleric("깃허브2", 20);

        assertEquals("깃허브2", cleric.name);
        assertEquals(20, cleric.currentHp);
        assertEquals(10, cleric.currentMp);
    }

    @Test
    @DisplayName("생성자 테스트3")
    void constructorTest3() {
        //given and when
        Cleric cleric = new Cleric("깃허브3", 20, 8);

        assertEquals("깃허브3", cleric.name);
        assertEquals(20, cleric.currentHp);
        assertEquals(8, cleric.currentMp);
    }
//    @Test // 테스트를 하기 위해 필요한 어노테이션
//    @DisplayName("마법을 사용하면 mp를 소모해 hp를 최대치로 회복해야 한다.")
//        // 옵셔널
//    void selfAid() {
//        // given(준비)
//        Cleric clericSelfAid = new Cleric();
//
//        //when(실행)
//        clericSelfAid.currentHp = 20;
//        clericSelfAid.selfAid();
//
//        //then(검증)
//        // 입력한 값와 실제 값이 같은지를 확인함
//        assertEquals(50, clericSelfAid.currentHp);
//        assertEquals(5, clericSelfAid.currentMp);
//
//        //when(실행)
//        clericSelfAid.currentMp = 3;
//        clericSelfAid.selfAid();
//
//        //then(검증)
//        assertEquals(50, clericSelfAid.currentHp);
//        assertEquals(3, clericSelfAid.currentMp);
//    }
//
//    @Test
//    @DisplayName("기도하면 MP가 (시간 ~ 시간+2) 만큼 회복되고, 최대 MP를 초과하지 않는다.")
//    void pray() {
//        // given(준비)
//        Cleric clericPray = new Cleric();
//        clericPray.currentMp = 5;
//        int tempMp = clericPray.currentMp;
//
//        //when
//        int heal = clericPray.pray(3);
//
//        //then
//        assertTrue(heal >= 3 && heal <= 5);
//        assertEquals(tempMp + heal, clericPray.currentMp);
//
//        //given
//        clericPray.currentHp = 3;
//
//        //when
//        clericPray.pray(2);
//
//        //then
//        assertEquals(10, clericPray.currentMp);
//
//    }
//
//    @Test
//    @DisplayName("최대 hp에서 pray")
//    void pray2() {
//        //given
//        Cleric clericPray = new Cleric();
//
//        //when
//        int heal = clericPray.pray(3);
//
//        //then
//        assertEquals(0, heal);
//        assertEquals(clericPray.maxHp, clericPray.currentHp);
//    }
//
//    @Test
//    @DisplayName("pray 매개변수 이상한 값 넣기")
//    void pray3() {
//        //given
//        Cleric clericPray = new Cleric();
//
//        //when
//        int heal = clericPray.pray(-2);
//
//        //then
//        assertEquals(0, heal);
//    }
}