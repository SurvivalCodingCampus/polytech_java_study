package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("객체 생성 시 hp,mp가 알맞게 설정되는지")
    void testCreate() {
        Cleric cleric = new Cleric();

        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("mp소모를 하면 maxHp까지 회복")
    void testSelfAid() {
        // given(준비)
        Cleric cleric = new Cleric();
        int previousMp = cleric.getMp();    // pray를 하기 전 mp

        // when(실행)
        cleric.selfAid();

        // then(검증)
        assertEquals(50, cleric.hp);

        if(previousMp >= 5) {
            assertEquals(5, previousMp - cleric.mp);
        }
    }

    @Test
    @DisplayName("pray 함수의 최종 mp회복량 측정")
    void testPray() {
        // 현재 마나가 0이어도 최대 10초가 maxMp
        for(int sec = 0; sec<=0; ++sec) {
            // given
            Cleric cleric = new Cleric();
            int previousMp = cleric.getMp();    // pray를 하기 전 현재 mp

            // when
            int amount = cleric.pray(sec);

            // then
            // randomPoint가 0이상 2이하로 설정되는지
            assertEquals(previousMp, cleric.getMp() - sec, 2);
            // 이전 마나와 현재 마나의 오차 범위가 amount(최종 회복량) 이내인지
            assertEquals(previousMp, cleric.getMp(), amount);
        }
    }
}