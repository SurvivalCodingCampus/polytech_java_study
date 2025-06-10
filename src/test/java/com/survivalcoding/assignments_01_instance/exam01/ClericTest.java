package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    @DisplayName("성직자 생성 시 HP, MP가 올바른 값으로 초기화되어야 한다.")
    void testCreate() {
        Cleric cleric = new Cleric();
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("selfAid() 사용 시 MP가 충분하다면, MP 5가 소비되고 HP는 최대 HP로 회복되어야 한다.,")
    void testselfAid() {
        //given
        Cleric cleric = new Cleric();
        cleric.hp = 20;  // 현재 HP를 20으로 설정 (최대 HP 미만)
        cleric.mp = 8;   // 현재 MP를 8로 설정 (MP 충분)

        //when
        cleric.selfAid();

        //then
        assertEquals(cleric.max_hp, cleric.hp);
        assertEquals(3, cleric.mp);
    }

    @Test
    @DisplayName("selfAid() 사용 시 MP가 부족하다면, HP가 회복되지 않고 MP도 감소하지 않아야 한다.")
    void testselfAid2() {
        //given
        Cleric cleric = new Cleric();
        cleric.hp = 20;  // 현재 HP를 20으로 설정 (최대 HP 미만)
        cleric.mp = 3;   // 현재 MP를 3으로 설정 (MP 부족)

        //when
        cleric.selfAid();

        //then
        assertEquals(20, cleric.hp);
        assertEquals(3, cleric.mp);
    }

    @Test
    @DisplayName("selfAid() 사용 시 HP가 이미 최대치라면, HP는 변하지 않고 MP만 소비되어야 한다.")
    void testselfAid3() {
        //given
        Cleric cleric = new Cleric();
        cleric.hp = 50;  // 현재 HP 최대
        cleric.mp = 10;   // 현재 MP를 10

        //when
        cleric.selfAid();

        //then
        assertEquals(cleric.max_hp, cleric.hp);
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("pray() 사용 시 MP가 회복되어야 하며, 반환 값은 실제로 회복된 MP 양과 일치해야 한다. (MP가 최대치가 아닐 때)")
    void testspray() {
        //given
        Cleric cleric = new Cleric();
        cleric.mp = 5; // MP를 최대치 미만으로 설정
        int beforeMp = cleric.mp;
        int sec = 3;

        //when

        int recovered = cleric.pray(sec);

        // mp는 반환된만큼 증가
        assertEquals(beforeMp + recovered, cleric.mp);
    }

    @Test
    @DisplayName("pray() 사용 시 MP는 MAX_MP를 초과하여 회복될 수 없으며, MAX_MP까지만 회복되어야 한다.")
    void testspray2() {
        //given
        Cleric cleric = new Cleric();
        cleric.mp = 10; // MP를 최대치로 설정
        int beforeMp = cleric.mp;
        int sec = 3;

        //when
        int recovered = cleric.pray(sec);

        // then 증가한 mp 최대값 넘지 않음
        assertEquals(beforeMp + recovered, cleric.max_mp);
    }



    @Test
    @DisplayName("pray() 사용 시 MP는 MAX_MP를 초과하여 회복될 수 없으며, MAX_MP까지만 회복되어야 한다.")
    void testspray3() {
        //given
        Cleric cleric = new Cleric();
        cleric.mp = 5; // MP 설정
        int beforeMp = cleric.mp;
        int sec = 0;

        //when
        int recovered = cleric.pray(sec);

        // then
        assertEquals(beforeMp + recovered, cleric.mp);  //mp 회복 안됨
        assertEquals(0, recovered);   // pray()는 0 반환
    }


    @Test
    @DisplayName("pray() 사용 시 MP가 이미 MAX_MP라면, MP는 변하지 않고 0을 반환해야 한다.")
    void testspray4() {
        //given
        Cleric cleric = new Cleric();
        cleric.mp = cleric.max_mp; // MP 최댓값응로 설정
        int beforeMp = cleric.mp;
        int sec = 0;

        //when
        int recovered = cleric.pray(sec);

        // then
        assertEquals(beforeMp + recovered, cleric.mp);  //mp 변화 없음
        assertEquals(0, recovered);   // pray()는 0 반환
    }


}