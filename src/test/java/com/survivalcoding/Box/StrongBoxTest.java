package com.survivalcoding.Box;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StrongBoxTest {

    @Test
    @DisplayName("금고 생성 테스트")
    void testStrongBox() {
        StrongBox<Integer> strongBox = new StrongBox<Integer>(123, KeyType.PADLOCK);

        assertEquals(null, strongBox.get());
        assertEquals(null, strongBox.get());
        assertEquals(null, strongBox.get());
        assertEquals(null, strongBox.get());

        StrongBox<Integer> strongBoxTest_0 = new StrongBox<Integer>(456, KeyType.PADLOCK);
        for (int i = 1; i < 1024; i++) {
            strongBoxTest_0.get();
        }
        assertEquals(456, strongBoxTest_0.get());

        StrongBox<Integer> strongBoxTest_1 = new StrongBox<Integer>(789, KeyType.BUTTON);
        for (int i = 1; i < 10000; i++) {
            strongBoxTest_1.get();
        }
        assertEquals(789, strongBoxTest_1.get());

        StrongBox<Integer> strongBoxTest_2 = new StrongBox<Integer>(745, KeyType.DIAL);
        for (int i = 1; i < 30000; i++) {
            strongBoxTest_2.get();
        }
        assertEquals(745, strongBoxTest_2.get());

        StrongBox<Integer> strongBoxTest_3 = new StrongBox<Integer>(746, KeyType.FINGER);
        for (int i = 1; i < 1000000; i++) {
            strongBoxTest_3.get();
        }
        assertEquals(746, strongBoxTest_3.get());


    }

}