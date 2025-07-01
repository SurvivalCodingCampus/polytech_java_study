package com.survivalcoding.Box;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StrongBoxTest {

    @Test
    @DisplayName("금고 생성 테스트")
    void testStrongBox() {
        StrongBox<Integer> strongBox = new StrongBox<Integer>(123);
        assertEquals(123, strongBox.get());
    }

}