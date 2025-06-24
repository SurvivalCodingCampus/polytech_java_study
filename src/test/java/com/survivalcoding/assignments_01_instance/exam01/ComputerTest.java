package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    @DisplayName("생성자를 통해 name, price, color, makerName이 잘 설정됐는지 테스트")
    void computerAllFieldCorrectly() {
        Computer computer = new Computer("name", 500000, "color", "makerName");

        assertEquals("name", computer.getName());
        assertEquals(500000, computer.getPrice());
        assertEquals("color", computer.getColor());
        assertEquals("makerName", computer.getMakerName());
    }

}