package com.survivalcoding.assignments_01_instance.exam01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClericTest {

    @Test
    public void testInitialValues() {
        Cleric c = new Cleric();

        assertEquals(Cleric.MAX_HP, c.HP);
        assertEquals(Cleric.MAX_MP, c.MP);
    }
}




