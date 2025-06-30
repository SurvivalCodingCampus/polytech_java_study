package com.survivalcoding.Asset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    Computer computer = new Computer();

    @Test
    @DisplayName("Computer 클래스의 makerName 입출력 확인")
    void makerName() {
        String input = "SAMSUNG";
        computer.setMakerName(input);
        assertEquals(input, computer.getMakerName());
    }
}