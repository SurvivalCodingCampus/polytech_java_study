package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test
    @DisplayName("Cleric 생성시 hp는 50 mp 10")
    void testCreate(){
        Cleric cleric=new Cleric();
        assertEquals(50,cleric.MAX_HP);
        assertEquals(10,cleric.MAX_MP);
    }

    @Test
    @DisplayName("selfAcid 사용으로 MP 5소모 HP 최대 회복")
    void selfAcid(){
        Cleric cleric=new Cleric();
        cleric.HP=30;
        cleric.MP=5;

        cleric.selfAid();

        assertEquals(50,cleric.HP);
        assertEquals(0,cleric.MP);
    }
    @Test
    @DisplayName("MP가 부족할 경우 selfAcid실행")
    void NotEnoughMP(){
        Cleric cleric = new Cleric();
        cleric.HP = 30;
        cleric.MP = 3;      // 부족한 MP

        cleric.selfAid();

        assertEquals(3, cleric.MP);         // MP 그대로
        assertEquals(30, cleric.HP);        // HP 변화 없음
    }

    @Test
    @DisplayName("pray 사용으로 MP 회복")
    void pray(){
        Cleric cleric=new Cleric();
        cleric.MP = 5;

        int recovered = cleric.pray(3);     // 3초 기도 → 3~5 회복 시도

        assertTrue(recovered >= 3 && recovered <= 5); // 회복 시도값은 범위 안에 있어야 함
        assertTrue(cleric.MP <= cleric.MAX_MP);
    }
}