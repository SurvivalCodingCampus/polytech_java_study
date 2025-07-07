package com.survivalcoding.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {

    @Test
    void padlock_Test() {
        // PADLOCK 타입 StrongBox 생성, 문자열 저장
        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("비밀문서");

        // PADLOCK_COUNT 횟수 이하에서는 항상 null이 반환되어야 함
        for (int i = 0; i < StrongBox.PADLOCK_COUNT; i++) {
            assertEquals(null, box.get());
        }
        // PADLOCK_COUNT+1번째에는 값이 반환되어야 함
        assertEquals("비밀문서", box.get(), "정해진 횟수 이후에는 값이 반환되어야 함");
    }

    @Test
    void button_Test() {
        // BUTTON 타입 StrongBox 생성, 정수 저장
        StrongBox<Integer> box = new StrongBox<>(KeyType.BUTTON);
        box.put(1234);

        for (int i = 0; i < StrongBox.BUTTON_COUNT; i++) {
            assertEquals(null, box.get());
        }
        assertEquals(1234, box.get(), "정해진 횟수 이후에는 값이 반환되어야 함");
    }

    @Test
    void dial_Test() {
        // DIAL 타입 StrongBox 생성, 실수 저장
        StrongBox<Double> box = new StrongBox<>(KeyType.DIAL);
        box.put(3.1415);

        for (int i = 0; i < StrongBox.DIAL_COUNT; i++) {
            assertEquals(null, box.get());
        }
        assertEquals(3.1415, box.get(), "정해진 횟수 이후에는 값이 반환되어야 함");
    }

    @Test
    void finger_Test() {
        // FINGER 타입 StrongBox 생성, 문자 저장
        StrongBox<Character> box = new StrongBox<>(KeyType.FINGER);
        box.put('K');

        for (int i = 0; i < StrongBox.FINGER_COUNT; i++) {
            assertEquals(null, box.get());
        }
        assertEquals('K', box.get(), "정해진 횟수 이후에는 값이 반환되어야 함");
    }

    @Test
    void nullTest() {
        // null 값을 저장했을 때 동작 확인
        StrongBox<String> box = new StrongBox<>(KeyType.BUTTON);
        box.put(null);

        for (int i = 0; i < StrongBox.BUTTON_COUNT + 2; i++) {
            assertNull(box.get(), "null을 저장하면 계속 null이어야 함");
        }
    }
}
