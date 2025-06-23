package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
    @Test
    @DisplayName("Wand getter setter 확인")
    void getsetWand() {
        Wand wand = new Wand();

        // get set Name
        assertThrows(IllegalArgumentException.class,()->{
            wand.setName("");
        });
        assertThrows(IllegalArgumentException.class,()->{
            wand.setName("ju");
        });
        wand.setName("홍길동");
        assertEquals("홍길동",wand.getName());

        // get set Power
        assertThrows(IllegalArgumentException.class,()->{
            wand.setPower(0.2);
        });
        assertThrows(IllegalArgumentException.class,()->{
            wand.setPower(101);
        });
        wand.setPower(50);
        assertEquals(50, wand.getPower());
    }

}