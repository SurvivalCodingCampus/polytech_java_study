package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonSlimeTest {

    @Test
    @DisplayName("A라는 이름의 독 슬라임 호출")
    void Testpoison() {
        PoisonSlime poisonSlime = new PoisonSlime("A");
        PoisonSlime poisonSlime01 = new PoisonSlime("B");

        assertEquals("A", poisonSlime.getName());
        assertEquals("B", poisonSlime01.getName());


    }
}