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
        for (int i = 0; i < 1023; i++) {
            strongBox.get();
        }
        //then
        assertEquals("Hi", strongBox.get());
    }

    @Test
    @DisplayName("1024번 이전이면 PADLOCK으로 부터 데이터가 안나오는가??")
    void StrongBox_1() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.PADLOCK);
        strongBox.put("Hi");
        //when
        for (int i = 1; i <= 1022; i++) {
            strongBox.get();
        }
        //then
        assertEquals(null, strongBox.get());
    }

    @Test
    @DisplayName("10000번째에는 데이터가 나오는가?")
    void strongBox2() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.BUTTON);
        strongBox.put("XYLITOL");
        //when
        for (int i = 1; i <= 9999; i++) {
            strongBox.get();
        }
        //then
        assertEquals("XYLITOL", strongBox.get());
    }

    @Test
    @DisplayName("10000번 이전이면 BUTTON으로 부터 데이터가 안나오는가??")
    void StrongBox2_2() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.BUTTON);
        strongBox.put("Hi");
        //when
        for (int i = 1; i <= 9998; i++) {
            strongBox.get();
        }
        //then
        assertEquals(null, strongBox.get());
    }

    @Test
    @DisplayName("30000번째에는 데이터가 나오는가?")
    void strongBox3() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.DIAL);
        strongBox.put("LOL");
        //when
        for (int i = 1; i <= 29999; i++) {
            strongBox.get();
        }
        //then
        assertEquals("LOL", strongBox.get());
    }

    @Test
    @DisplayName("30000번 이전이면 DIAL으로 부터 데이터가 안나오는가??")
    void StrongBox3_2() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.DIAL);
        strongBox.put("Hi");
        //when
        for (int i = 1; i <= 9998; i++) {
            strongBox.get();
        }
        //then
        assertEquals(null, strongBox.get());
    }


    @Test
    @DisplayName("1000000번째에는 데이터가 나오는가?")
    void strongBox4() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.FINGER);
        strongBox.put("LOL");
        //when
        for (int i = 1; i <= 999999; i++) {
            strongBox.get();
        }
        //then
        assertEquals("LOL", strongBox.get());
    }

    @Test
    @DisplayName("1,000,000번 이전이면 FINGER으로 부터 데이터가 안나오는가??")
    void StrongBox4_2() {
        //given
        StrongBox<String> strongBox = new StrongBox<>(KeyType.FINGER);
        strongBox.put("Hi");
        //when
        for (int i = 1; i <= 250000; i++) {
            strongBox.get();
        }
        //then
        assertEquals(null, strongBox.get());
    }


}