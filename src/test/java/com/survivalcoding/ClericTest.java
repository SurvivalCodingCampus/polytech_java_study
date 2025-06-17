package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    @DisplayName("객체 생성 시 hp,mp가 알맞게 설정되는지")
    void testCreate() {
        String testName = "아서스";

        /* 1. 1개 파라미터를 가진 생성자 호출 */
        // given, when
        Cleric cleric1 = new Cleric(testName);

        // then
        // name, hp, mp 테스트
        assertEquals(testName, cleric1.getName());
        assertEquals(Cleric.maxHp, cleric1.getHp());
        assertEquals(Cleric.maxMp, cleric1.getMp());

        /* 2. 2개 파라미터를 가진 생성자 호출 */
        // given, when
        int testHp = 35;
        Cleric cleric2 = new Cleric(testName, testHp);

        // then
        // hp, mp 테스트
        assertEquals(testHp, cleric2.getHp());
        assertEquals(Cleric.maxMp, cleric2.getMp());

        /* 2. 3개 파라미터를 가진 생성자 호출 */
        // given, when
        int testMp = 5;
        Cleric cleric3 = new Cleric(testName, testHp, testMp);

        // then
        // mp만 테스트
        assertEquals(testMp, cleric3.getMp());
    }

    @Test
    @DisplayName("mp소모를 하면 maxHp까지 회복")
    void testSelfAid() {
        String testName = "아서스";
        Cleric[] clerics = { new Cleric(testName),
                new Cleric(testName, 35),
                new Cleric(testName, 40, 5)};
        int[] previousMp = { clerics[0].getMp(), clerics[1].getMp(), clerics[2].getMp()};

        // when
        for(int i=0; i<clerics.length; ++i) {
            clerics[i].selfAid();
        }

        // then
        for(int i=0; i<clerics.length; ++i) {
            if (previousMp[i] >= 5) {
                assertEquals(5, previousMp[i] - clerics[i].getMp());
            } else {
                assertEquals(previousMp[i], clerics[i].getMp()); // MP 변화 없음
            }
        }
    }

    @Test
    @DisplayName("pray 함수의 최종 mp회복량 측정")
    void testPray() {
        String testName = "아서스";
        Cleric[] clerics = {
                new Cleric(testName),
                new Cleric(testName, 35),
                new Cleric(testName, 40, 5)
        };

        for (int sec = 1; sec <= 10; ++sec) {
            for (int i = 0; i < clerics.length; ++i) {
                int beforeMp = clerics[i].getMp();

                // when
                int recovered = clerics[i].pray(sec);
                int afterMp = clerics[i].getMp();

                // then
                // 예상 회복량 범위: sec ~ sec+2
                int maxPossibleRecovery = Math.min(sec + 2, Cleric.maxMp - beforeMp);
                int minPossibleRecovery = Math.min(sec, Cleric.maxMp - beforeMp);

                assertTrue(recovered >= minPossibleRecovery && recovered <= maxPossibleRecovery);

                assertEquals(beforeMp + recovered, afterMp);
            }
        }
    }
}