package com.survivalcoding.generic;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


class StrongBoxTest {

    @Test
    @DisplayName("PADLOCK - 1,024회 이전에는 데이터 반환되지 않아야 한다")
    void testGetBeforeLimitPADLOCK() {
        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK); //'PADLOCK' 키 타입으로 생성자 생성
        box.put("SECRET");// "SECRET" 라는 data 값 넣음
        // 1024번까지 get() 호출하면 null 나와야 정상
        for (int i = 0; i < 1024; i++) {
            assertNull(box.get(), i + "번째 호출에서 null 아니면 실패");
            // assertNull(검사할 값 , message 문구)
        }

    }


    @Test
    @DisplayName("PADLOCK - 1,024회에 도달하면 데이터가 반환되어야 한다.")
    void testGetAtLimitPADLOCK() {
        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("SECRET");// "SECRET" 라는 data 값 넣음

        // 1024번 무시, 내부적으로 count만 증가
        for (int i = 0; i < 1024; i++) {
            box.get();
        }

        // 1025 호출 > 실제 값 나와야함
        assertEquals("SECRET", box.get()); // get() 결과가 "SECRET" 나오면 성공
    }


    @Test
    @DisplayName("BUTTON - 10,000회 이전에는 데이터 반환되지 않아야 한다")
    void testGetBeforeLimitBUTTON() {
        StrongBox<String> box = new StrongBox<>(KeyType.BUTTON); //'PADLOCK' 키 타입으로 생성자 생성
        box.put("SECRET");// "SECRET" 라는 data 값 넣음
        // 1024번까지 get() 호출하면 null 나와야 정상
        for (int i = 0; i < 10000; i++) {
            assertNull(box.get(), i + "번째 호출에서 null 아니면 실패");
            // assertNull(검사할 값 , message 문구)
        }

    }


    @Test
    @DisplayName("BUTTON - 10,000회 도달하면 데이터가 반환되어야 한다.")
    void testGetAtLimitBUTTON() {
        StrongBox<String> box = new StrongBox<>(KeyType.BUTTON);
        box.put("SECRET");// "SECRET" 라는 data 값 넣음

        // 1024번 무시, 내부적으로 count만 증가
        for (int i = 0; i < 10000; i++) {
            box.get();
        }

        // 1025 호출 > 실제 값 나와야함
        assertEquals("SECRET", box.get()); // get() 결과가 "SECRET" 나오면 성공
    }

    @Test
    @DisplayName("DIAL - 30,000회 이전에는 데이터 반환되지 않아야 한다")
    void testGetBeforeLimitDIAL() {
        StrongBox<String> box = new StrongBox<>(KeyType.DIAL); //'PADLOCK' 키 타입으로 생성자 생성
        box.put("SECRET");// "SECRET" 라는 data 값 넣음
        // 1024번까지 get() 호출하면 null 나와야 정상
        for (int i = 0; i < 30000; i++) {
            assertNull(box.get(), i + "번째 호출에서 null 아니면 실패");
            // assertNull(검사할 값 , message 문구)
        }

    }


    @Test
    @DisplayName("DIAL - 30,000회 도달하면 데이터가 반환되어야 한다.")
    void testGetAtLimitDIAL() {
        StrongBox<String> box = new StrongBox<>(KeyType.DIAL);
        box.put("SECRET");// "SECRET" 라는 data 값 넣음

        // 1024번 무시, 내부적으로 count만 증가
        for (int i = 0; i < 30000; i++) {
            box.get();
        }

        // 1025 호출 > 실제 값 나와야함
        assertEquals("SECRET", box.get()); // get() 결과가 "SECRET" 나오면 성공
    }

    @Test
    @DisplayName("FINGER - 1,000,000회 이전에는 데이터 반환되지 않아야 한다")
    void testGetBeforeLimitFINGER() {
        StrongBox<String> box = new StrongBox<>(KeyType.FINGER); //'PADLOCK' 키 타입으로 생성자 생성
        box.put("SECRET");// "SECRET" 라는 data 값 넣음
        // 1024번까지 get() 호출하면 null 나와야 정상
        for (int i = 0; i < 1000000; i++) {
            assertNull(box.get(), i + "번째 호출에서 null 아니면 실패");
            // assertNull(검사할 값 , message 문구)
        }

    }


    @Test
    @DisplayName("FINGER - 1,000,000회에 도달하면 데이터가 반환되어야 한다.")
    void testGetAtLimitFINGER() {
        StrongBox<String> box = new StrongBox<>(KeyType.FINGER);
        box.put("SECRET");// "SECRET" 라는 data 값 넣음

        // 1024번 무시, 내부적으로 count만 증가
        for (int i = 0; i < 1000000; i++) {
            box.get();
        }

        // 1025 호출 > 실제 값 나와야함
        assertEquals("SECRET", box.get()); // get() 결과가 "SECRET" 나오면 성공
    }

    //DIAL ,FINGER

}