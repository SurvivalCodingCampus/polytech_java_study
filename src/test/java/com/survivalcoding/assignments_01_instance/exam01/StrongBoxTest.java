package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    StrongBox<String> strongBox = new StrongBox<>(KeyType.PADLOCK);

    @Test
    void get() {
        strongBox.put("PADLOCk Open");
        for(int i = 0; i < 1023; i++){
            strongBox.get();
        }
        assertEquals("PADLOCk Open", strongBox.get());
    }
}