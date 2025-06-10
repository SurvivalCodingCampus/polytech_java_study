package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinokoTest {


    @Test
    @DisplayName("attack()을 하면 hp 100이 되어야한다")
    void testAttack(){
        //given(준비)
        Kinoko kinoko = new Kinoko();
        //when(실행)
        kinoko.attack();

        //then(검증)코드
        assertEquals(100, kinoko.hp);

    }

    @Test

    @DisplayName("hp 설정이 잘 되어야 한다")
    void testSetHP() {

    }


}