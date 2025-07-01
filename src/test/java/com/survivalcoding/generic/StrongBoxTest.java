package com.survivalcoding.generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.survivalcoding.generic.KeyType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StrongBoxTest {


    @Test
    @DisplayName("데이터 검사")
    void getData() {
        StrongBox<Integer> strongBox = new StrongBox<>(1025, PADLOCK);
        StrongBox<Integer> strongBox1 = new StrongBox<>(10001, BUTTON);
        StrongBox<Integer> strongBox2 = new StrongBox<>(30001, DIAL);
        StrongBox<Integer> strongBox3 = new StrongBox<>(1000001, FINGER);

        strongBox.setData(1025);
        assertEquals(1025, strongBox.getData());
        strongBox.setData(10001);
        assertEquals(10001, strongBox.getData());
        strongBox.setData(300001);
        assertEquals(300001, strongBox.getData());
        strongBox.setData(1000001);
        assertEquals(1000001, strongBox.getData());


        assertThrows(IllegalArgumentException.class, () -> {
            strongBox.setData(1024);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            strongBox.setData(10001);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            strongBox.setData(300001);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            strongBox.setData(1000001);
        });

    }


}

