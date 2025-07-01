package com.survivalcoding;

import com.survivalcoding.generic.KeyType;
import com.survivalcoding.generic.StrongBox;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    @Test
    @DisplayName("StrongBox count에 따른 get()을 확인")
    void getTest() {
        StrongBox<Integer> strongBox = new StrongBox<>(KeyType.PADLOCK);

        strongBox.put(2);
        assertEquals(strongBox.get(), null);
        assertEquals(strongBox.getCount(), 1);

        // limit까지 test
        for(int i=0; i<strongBox.PADLOCK_COUNT-1; i++){
            strongBox.get();
        }
        assertEquals(strongBox.get(), 2);
        assertEquals(strongBox.getCount(), 0);
    }


}