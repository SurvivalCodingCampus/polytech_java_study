package com.survivalcoding.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    // 객체 생성 시 초기화 테스트
    @Test
    @DisplayName("Cleric 객체 생성 시 최대 hp = 50")
    void testInitMaxHp(){
        Cleric cleric = new Cleric("testHero");
        assertEquals(50, Cleric.maxHp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최초 hp = 50")
    void testInitHp(){
        Cleric cleric = new Cleric("testHero");
        assertEquals(50, cleric.hp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최대 mp = 10")
    void testInitMaxMp(){
        Cleric cleric = new Cleric("testHero");
        assertEquals(10, Cleric.maxMp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 최초 mp = 10")
    void testInitMp(){
        Cleric cleric = new Cleric("testHero");
        assertEquals(10, cleric.mp);
    }
    @Test
    @DisplayName("Cleric 객체 생성 시 Random 객체 생성 확인")
    void testRandomInstanceIsNotNull(){
        Cleric cleric = new Cleric("testHero");
        assertNotNull(cleric.rand); // 객체가 Null인지 확인
    }


    // setHp() 테스트
    @Test
    @DisplayName("setHp() 확인(1) hp 변화 적용 확인")
    void testSetHp(){
        Cleric cleric = new Cleric("testHero");
        int testHp = 5;

        cleric.setHp(testHp);
        assertEquals(testHp, cleric.hp);
    }

    @Test
    @DisplayName("setHp() 확인(2) maxHp보다 큰 값인 hp 적용X 확인")
    void testSetHpIgnoresValueAboveMax(){
        Cleric cleric = new Cleric("testHero");
        int beforeHp = cleric.hp;
        int testHp = 100;

        // beforeHp가 유지되는지 확인
        cleric.setHp(testHp);
        assertEquals(beforeHp, cleric.hp);
    }

    @Test
    @DisplayName("setHp() 확인(3) 0보다 작은 값인 hp 적용X 확인")
    void testSetHpIgnoresNegativeValue(){
        Cleric cleric = new Cleric("testHero");
        int beforeHp = cleric.hp;
        int testHp = -100;

        // beforeHp가 유지되는지 확인
        cleric.setHp(testHp);
        assertEquals(beforeHp, cleric.hp);
    }


    // setMp() 테스트
    @Test
    @DisplayName("setMp() 확인(1) mp 변화 적용 확인")
    void testSetMp() {
        Cleric cleric = new Cleric("testHero");
        int testMp = 5;

        cleric.setMp(testMp);
        assertEquals(testMp, cleric.mp);
    }

    @Test
    @DisplayName("setMp() 확인(2) maxMp보다 큰 값 적용X 확인")
    void testSetMpIgnoresValueAboveMax() {
        Cleric cleric = new Cleric("testHero");
        int beforeMp = cleric.mp;
        int testMp = 100;

        cleric.setMp(testMp);    // 100으로 설정 시도
        assertEquals(beforeMp, cleric.mp); // 변화 없음
    }

    @Test
    @DisplayName("setMp() 확인(3) 0보다 작은 값 적용X 확인")
    void testSetMpIgnoresNegativeValue() {
        Cleric cleric = new Cleric("testHero");
        int beforeMp = cleric.mp;
        int testMp = -100;

        cleric.setMp(testMp);    // -100으로 설정 시도
        assertEquals(beforeMp, cleric.mp); // 변화 없음
    }

    // pray() 테스트
    @Test
    @DisplayName("pray() 확인(1) 회복한 다음 maxMp 넘지 않는 경우")
    void testPray(){
        Cleric cleric = new Cleric("testHero");
        int sec = 3;
        int testMp = 1; // test를 위해 mp를 1로 설정

        cleric.setMp(testMp);
        int recoveryMp = cleric.pray(sec);

        // return 받은 mp 회복량이 범위 내인지 확인(sec+0~2)
        assertTrue(sec <= recoveryMp && recoveryMp <= sec+2);
    }
    @Test
    @DisplayName("pray() 확인(2) 회복한 다음 maxMp 넘는 경우 recoveryMp 확인")
    void testPrayOverMaxMp() {
        Cleric cleric = new Cleric("testHero");
        int sec = 3;
        int testMp = 9; // test를 위해 mp를 9로 설정

        cleric.setMp(testMp);
        int recoveryMp = cleric.pray(sec);

        // 반환받은 mp 회복량이 maxHp - testMp 인지 확인 -> 지금은 1 나와야함
        assertEquals(Cleric.maxMp - testMp, recoveryMp);
    }
    @Test
    @DisplayName("pray() 확인(3) 이미 mp가 max인 경우 recoveryMp = 0 확인")
    void testPrayMpIsMax() {
        Cleric cleric = new Cleric("testHero");
        int sec = 3;

        cleric.setMp(Cleric.maxMp); // maxMp로 set해주기
        int recoveryMp = cleric.pray(sec);

        // 반환받은 mp 회복량이 0이어야함. 이미 max이므로
        assertEquals(0, recoveryMp);
    }

    // selfAid() 테스트
    @Test
    @DisplayName("selfAid() 확인(1) mp 소진량 = 5 확인")
    void testSelfAidConsumeMp(){
        Cleric cleric = new Cleric("testHero");
        int testHp = 10;
        int beforeMp = cleric.mp; // selfAid() 하기 전 mp 챙겨두기

        cleric.setHp(testHp);   // hp 회복할 수 있도록 hp 10으로 변경
        cleric.selfAid();

        // selfAid() 하면 mp가 -5 되어야하므로
        assertEquals(beforeMp-5, cleric.mp);
    }

    @Test
    @DisplayName("selfAid() 확인(2) mp가 부족할 때 mp가 그대로인지 확인")
    void testSelfAidNotEnoughMpCheckMp(){
        Cleric cleric = new Cleric("testHero");
        int testMp = 1;
        int testHp = 10;

        cleric.setMp(testMp);  // mp 부족하게 mp를 1로 변경
        cleric.setHp(testHp);  // hp 회복할 수 있도록 hp 10으로 변경
        cleric.selfAid();

        // selfAid() 하면 mp-5 되어야하는데, mp 부족하면 회복X mp 그대로
        assertEquals(testMp, cleric.mp);
    }

    @Test
    @DisplayName("selfAid() 확인(h) mp가 부족할 때 hp가 그대로인지 확인")
    void testSelfAidNotEnoughMpCheckHp(){
        Cleric cleric = new Cleric("testHero");
        int testMp = 1;
        int testHp = 10;

        cleric.setMp(testMp);  // mp 부족하게 mp를 1로 변경
        cleric.setHp(testHp);
        cleric.selfAid();

        // selfAid() 하면 hp가 max가 되어야하는데, mp 부족하면 회복X hp 그대로
        assertEquals(testHp, cleric.hp);
    }

    @Test
    @DisplayName("selfAid() 확인(4) hp가 회복되었는지 확인")
    void testSelfAidRecoveryHp(){
        Cleric cleric = new Cleric("testHero");
        int testHp = 10;

        cleric.setHp(testHp);   // hp 회복할 수 있도록 hp 10으로 변경
        cleric.selfAid();

        // selfAid() 하면 maxHp로 채워지므로
        assertEquals(Cleric.maxHp, cleric.hp);
    }

    @Test
    @DisplayName("selfAid() 확인(5) hp가 이미 max인 경우 mp변화도 없겠다")
    void testSelfAidHpIsMax(){
        Cleric cleric = new Cleric("testHero");
        int beforeMp = cleric.mp;

        cleric.setHp(Cleric.maxHp); // maxHp로 set해주기
        cleric.selfAid();

        // 이미 maxHp면 mp변화 없을거야
        assertEquals(beforeMp, cleric.mp);
    }
}