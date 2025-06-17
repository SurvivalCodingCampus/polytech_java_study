package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {

    @Test

    void test()
    {
        Wand wand = new Wand ("지팡이", 10);
        wand.test();

        assertEquals("지팡이", wand.getName());
        assertEquals(10, wand.getPower());

        wand.setName("마법의 지팡이");
        wand.setPower(30);

    }

}