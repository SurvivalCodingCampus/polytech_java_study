package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
@Test
@DisplayName("selfAid() 사용 시 MP가 부족하면 HP 회복되지 않고 MP도 감소하지 않아야 한다.")

void testSelfAidLow() {
// given(준비)
    Cleric cleric = new Cleric("test");

    cleric.MP = 3;
    cleric.HP = 10;
//when(실행)
    cleric.selfAid();

    //then(검증)
    assertEquals(3, cleric.MP);
    assertEquals(10, cleric.HP);
}

    @Test
    @DisplayName("selfAid() 사용 시 HP가 이미 최대치라면 HP는 변하지 않고 MP만 소비되어야 한다.")
    void testSelfAidMax() {
        // given(준비)
        Cleric cleric = new Cleric("test");
        cleric.MP = 10;
        cleric.HP = Cleric.MAX_HP;

        // when(실행)
        cleric.selfAid();

        // then(검증)
        assertEquals(5, cleric.MP); // MP만 감소
        assertEquals(Cleric.MAX_HP, cleric.HP); // HP는 그대로
    }
}

