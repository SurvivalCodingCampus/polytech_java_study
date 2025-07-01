package com.survivalcoding;

import com.survivalcoding.generic.KeyType;
import com.survivalcoding.generic.StrongBox;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {

    @Test
    @DisplayName("제네릭 확인")
    void putDataTest() {
        StrongBox<String> strongBox = new StrongBox<>(KeyType.PADLOCK);

        strongBox.put("test");

        // limit까지 test
        for(int i=0; i<StrongBox.PADLOCK_COUNT; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), "test");
    }

        @Test
    @DisplayName("StrongBox count에 따른 Padlock 타입의 get()을 확인")
    void getPadlockTest() {
        StrongBox<Integer> strongBox = new StrongBox<>(KeyType.PADLOCK);

        strongBox.put(2);
        assertEquals(strongBox.get(), null);
        assertEquals(strongBox.getCount(), 1);

        // limit까지 test
        for(int i=0; i<StrongBox.PADLOCK_COUNT-1; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), 2);
        assertEquals(strongBox.getCount(), 0);
    }

    @Test
    @DisplayName("StrongBox count에 따른 Button 타입의 get()을 확인")
    void getButtonTest() {
        StrongBox<Integer> strongBox = new StrongBox<>(KeyType.BUTTON);

        strongBox.put(2);
        assertEquals(strongBox.get(), null);
        assertEquals(strongBox.getCount(), 1);

        // limit까지 test
        for(int i=0; i<StrongBox.BUTTON_COUNT-1; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), 2);
        assertEquals(strongBox.getCount(), 0);
    }
    @Test
    @DisplayName("StrongBox count에 따른 Dial 타입의 get()을 확인")
    void getDialTest() {
        StrongBox<Integer> strongBox = new StrongBox<>(KeyType.DIAL);

        strongBox.put(2);
        assertEquals(strongBox.get(), null);
        assertEquals(strongBox.getCount(), 1);

        // limit까지 test
        for(int i=0; i<StrongBox.DIAL_COUNT-1; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), 2);
        assertEquals(strongBox.getCount(), 0);
    }

    @Test
    @DisplayName("StrongBox count에 따른 Button 타입의 get()을 확인")
    void getFingerTest() {
        StrongBox<Integer> strongBox = new StrongBox<>(KeyType.FINGER);

        strongBox.put(2);
        assertEquals(strongBox.get(), null);
        assertEquals(strongBox.getCount(), 1);

        // limit까지 test
        for(int i=0; i<StrongBox.FINGER_COUNT-1; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), 2);
        assertEquals(strongBox.getCount(), 0);
    }
}