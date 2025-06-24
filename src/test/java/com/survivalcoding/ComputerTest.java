package com.survivalcoding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    @DisplayName("컴퓨터 생성 테스트")
    void testComputer() {
        Computer computer = new Computer("진현규가만듬", "콤퓨타", 18500, "검정색", "삼성");
        assertEquals("진현규가만듬", computer.getPatent());
        assertEquals(computer.getName(),"콤퓨타");
        assertEquals(computer.getPrice(),18500);
        assertEquals(computer.getColor(), "검정색");
        assertEquals(computer.getMakerName(), "삼성");
    }
}