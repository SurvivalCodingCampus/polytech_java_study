package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
@Test
@DisplayName("Cleric 생성자 테스트, 이름과 HP/MP 초기화")

void testClericConstructor() {
// given(준비)
    final String Name = "Cleric";
//when(실행)
    final Cleric cleric = new Cleric(Name);

    //then(검증)
    assertEquals(Name, cleric.name);
    assertEquals(Cleric.MAX_HP, cleric.HP);
    assertEquals(Cleric.MAX_MP, cleric.MP);
}
}