package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class KinokoTest {


    @Test
    @DisplayName("attack()을 하면 hp가 100이 되어야 한다.")
    void testAttack() {
        //준비 given
        Kinoko kinoko = new Kinoko();
        //실행 when
        kinoko.attack();
        //검증 then
        assertEquals(100, kinoko.hp);
    }

    @Test
    @DisplayName("hp가 설정이 잘 되어야 한다.")
    void testSetup() {

    }
}