package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClericTest {


    @Test // 테스트를 하기 위해 필요한 어노테이션
    @DisplayName("마법을 사용하면 mp를 소모해 hp를 최대치로 회복해야 한다.") // 옵셔널
    void selfAid() {
        // given(준비)
        Cleric clericSelfAid = new Cleric();
        //when(실행)
        clericSelfAid.selfAid();

        //then(검증)
        // 입력한 값와 실제 값이 같은지를 확인함
        assertEquals(50,clericSelfAid.currentHp);
        assertEquals(5,clericSelfAid.currentMp);

        //when(실행)
        clericSelfAid.selfAid();

        //then(검증)
        // 입력한 값와 실제 값이 같은지를 확인함
        assertEquals(50,clericSelfAid.currentHp);
        assertEquals(0,clericSelfAid.currentMp);

        //when(실행)
        clericSelfAid.selfAid();

        //then(검증)
        // 입력한 값와 실제 값이 같은지를 확인함
        assertEquals(50,clericSelfAid.currentHp);
        assertEquals(0,clericSelfAid.currentMp);
    }

    @Test
    @DisplayName("기도하면 MP가 (시간 ~ 시간+2) 만큼 회복되고, 최대 MP를 초과하지 않는다.")
    void pray() {
        // given(준비)
        Cleric clericPray = new Cleric();

        //when
        clericPray.pray(3);

        //then
        assertEquals(10,clericPray.currentMp);
        clericPray.currentHp = 3;

        clericPray.pray(2);
        //then
        assertEquals(10,clericPray.currentMp);

    }
}