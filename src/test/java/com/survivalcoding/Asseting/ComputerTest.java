package com.survivalcoding.Asseting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    @DisplayName("컴퓨터 생성 테스트")
    void testComputer() {
        Computer computer = new Computer("콤퓨타", 18500, "검정색", 45.4,"삼성");
        assertEquals("콤퓨타", computer.getName());
        assertEquals(18500, computer.getPrice());
        assertEquals("검정색", computer.getColor());
        assertEquals(45.4, computer.getweight());
        assertEquals("삼성", computer.getMakerName());
    }
}