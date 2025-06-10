package com.survivalcoding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClericTest {

    @Test
    @DisplayName("사제 생성시 hp는 50, mp는 10이다")
    void testCreate() {
        Cleric cleric = new Cleric();
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);
        assertEquals("Cleric", cleric.name);
    }
}