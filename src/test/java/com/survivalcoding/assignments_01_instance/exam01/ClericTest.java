package com.survivalcoding.assignments_01_instance.exam01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClericTest {

    @Test
    public void testInitialValues() {
        Cleric c = new Cleric("test");

        assertEquals(Cleric.MAX_HP, c.hp);
        assertEquals(Cleric.MAX_MP, c.mp);
    }

    @Test
    public void testA() {
        Cleric c = new Cleric("아서스", 40, 5);
        assertEquals("아서스", c.name);
        assertEquals(40, c.hp);
        assertEquals(5, c.mp);
    }

    @Test
    public void testB() {
        Cleric c = new Cleric("아서스", 35);
        assertEquals("아서스", c.name);
        assertEquals(35, c.hp);
        assertEquals(Cleric.MAX_MP, c.mp);
    }

    @Test
    public void testC() {
        Cleric c = new Cleric("아서스");
        assertEquals("아서스", c.name);
        assertEquals(Cleric.MAX_HP, c.hp);
        assertEquals(Cleric.MAX_MP, c.mp);
    }




}




