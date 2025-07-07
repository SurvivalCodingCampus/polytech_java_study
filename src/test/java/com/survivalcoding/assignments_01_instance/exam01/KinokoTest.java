package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Kinoko;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinokoTest {

    @Test
    @DisplayName("버섯 생성시 hp는 50이어야 한다")
    void testCreate() {
        Kinoko kinoko = new Kinoko();
        assertEquals(50, kinoko.hp);
}
    @Test
    @DisplayName("attack()을 하면 hp 가 100이 되어야 한다")
    void testAttack() {
        // given(준비)
        Kinoko kinoko = new Kinoko();
        assertEquals(50, kinoko.hp);

        // when(실행)
        kinoko.attack();

        // then(검증)
        assertEquals(100, kinoko.hp);
    }

    @Test
    @DisplayName("hp 설정이 잘 되어야 한다")
    void testSetHp() {
        Kinoko kinoko = new Kinoko();
        kinoko.setHp(200);
        assertEquals(200, kinoko.hp);
    }
}