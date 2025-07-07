package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyTypeTest {

    @Test
    public void testPadlockLimit() {
        assertEquals(1024, KeyType.PADLOCK.getLimit(), "1024");
    }

    @Test
    public void testButtonLimit() {
        assertEquals(10000, KeyType.BUTTON.getLimit(), "10000");
    }

    @Test
    public void testDialLimit() {
        assertEquals(30000, KeyType.DIAL.getLimit(), "30000");
    }

    @Test
    public void testFingerLimit() {
        assertEquals(1000000, KeyType.FINGER.getLimit(), "1000000");
    }

    @Test
    public void testStrongBox_Padlock() {
        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("Object");

        String result = null;

        // 1023회까지는 null
        for (int i = 0; i < 1023; i++) {
            result = box.get();
            assertNull(result, "null");
        }

        // 1024번째 호출시 값 출력
        result = box.get();
        assertEquals("Object", result, "값 출력");
    }
}