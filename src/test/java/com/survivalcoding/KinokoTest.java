package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinokoTest {
    @Test
    @DisplayName("kinoko 객체 생성시 hp는 50이어야한다")
    void testCreate() {
        Kinoko kinoko = new Kinoko();
        assertEquals(50, kinoko.hp);
    }

    @Test
    @DisplayName("kinoko의 hp 설정이 잘되는지 확인")
    void testSetHp() {
        Kinoko kinoko = new Kinoko();
        kinoko.setHp(200);
        assertEquals(200, kinoko.hp);
    }
}