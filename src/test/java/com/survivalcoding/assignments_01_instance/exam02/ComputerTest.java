package com.survivalcoding.assignments_01_instance.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    @DisplayName("Computer 생성 테스트")
    void create() {

        //given
        String name = "컴퓨터";
        long price = 1_001L;
        Color color = Color.GRAY;
        double weight = 1.0;
        String makerName = "Samsung";

        //when
        Computer computer = new Computer(name, price, color, weight, makerName);

        //then
        assertInstanceOf(Asset.class, computer);
        assertInstanceOf(TangibleAsset.class, computer);
        assertEquals(name, computer.getName());
        assertEquals(price, computer.getPrice());
        assertEquals(color, computer.getColor());
        assertEquals(weight, computer.getWeight());
        assertEquals(makerName, computer.getMakerName());
    }

}