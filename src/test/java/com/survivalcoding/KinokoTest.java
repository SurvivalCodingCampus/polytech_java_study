package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinokoTest {
    @Test
    @DisplayName("attack를 하면 hp가 100이 되어야 한다.")
    void testAttack(){
        Kinoko kinoko = new Kinoko();

        kinoko.attack();

        assertEquals(100, kinoko.hp);
    }
}