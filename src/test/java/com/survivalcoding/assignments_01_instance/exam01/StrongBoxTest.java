package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {

    @Test
    @DisplayName("제한 횟수 초과되면 열림")

    void testUnlock() {
        StrongBox box = new StrongBox(StrongBox.KeyType.PADLOCK);
        box.put("data");

        for(int i = 0; i<1024; i++) {
            assertNull(box.get());
        }

        assertEquals("data",box.get());
    }

}