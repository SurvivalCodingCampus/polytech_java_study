package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlimeTest {

    Slime slime = new Slime(10, "슬라임");

    @Test
    void getSuffix() {
        assertEquals("슬라임", slime.getSuffix());
    }

    @Test
    void getHp() {
        assertEquals(10, slime.getHp());
    }

    @Test
    void setHP(){
        slime.setHp(10);
    }

}