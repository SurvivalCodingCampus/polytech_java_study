package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {

    @Test
    void test()
    {
        Wand wand = new Wand ("지팡이", 10);
        wand.wandTest();

        assertEquals("지팡이", wand.getName());
        assertEquals(10, wand.getPower());

       /* assertThrows(IllegalArgumentException.class, () ->
        {wand.setName(null);
        });*/

        assertThrows(IllegalArgumentException.class, () ->
        {wand.setPower(50);

        });

    }

}