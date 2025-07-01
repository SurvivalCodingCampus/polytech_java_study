package com.survivalcoding.Box;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrongBoxTest {

    @Test
    @DisplayName("1024번째에 PADLOCK으로 부터 데이터가 나오는가??")
    void StrongBox() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.PADLOCK);
        strongBox.put("Hi");
        //when
        for (int i = 1; i <= 1023; i++) {
            strongBox.get();
        }
        //then
        assertEquals("Hi", strongBox.get());
    }

}