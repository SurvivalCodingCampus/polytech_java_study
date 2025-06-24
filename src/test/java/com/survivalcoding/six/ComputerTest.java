package com.survivalcoding.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ComputerTest {
    Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer(
                "윈도우",
                17000,
                "black",
                1.2,
                "intel"
        );
    }

    @Test
    @DisplayName("Computer 클래스 생성자 테스트")
    public void testBook() {
        assertEquals("윈도우", computer.getName());
        assertEquals(17000, computer.getPrice());
        assertEquals("black", computer.getColor());
        assertEquals(1.2, computer.getWeight());
        assertEquals("intel", computer.getMakerName());
    }

    @Test
    @DisplayName("Computer throw 체크")
    public void testBookThrow() {
        assertThrows(IllegalArgumentException.class, () -> computer.setName(null));
        assertThrows(IllegalArgumentException.class, () -> computer.setPrice(-20));
        assertThrows(IllegalArgumentException.class, () -> computer.setColor(null));
        assertThrows(IllegalArgumentException.class, () -> computer.setWeight(-20));
        assertThrows(IllegalArgumentException.class, () -> computer.setMakerName(null));
    }
}