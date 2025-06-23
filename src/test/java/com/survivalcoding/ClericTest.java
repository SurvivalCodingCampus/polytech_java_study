package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("오버로드 생성자 확인")
    void test() {
        Cleric cleric1 = new Cleric("아서스", 40, 5);
        Cleric cleric2 = new Cleric("아서스", 35);
        Cleric cleric3 = new Cleric("아서스");

        assertEquals(40, cleric1.hp);
        assertEquals(5, cleric1.mp);

        assertEquals(35, cleric2.hp);
        assertEquals(10, cleric2.mp);

        assertEquals(50, cleric3.hp);
        assertEquals(10, cleric3.mp);
    }
}