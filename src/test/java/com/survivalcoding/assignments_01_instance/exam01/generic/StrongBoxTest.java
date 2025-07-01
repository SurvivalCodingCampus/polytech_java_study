package com.survivalcoding.assignments_01_instance.exam01.generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.survivalcoding.assignments_01_instance.exam01.generic.KeyType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {

    @Test
    @DisplayName("생성자 테스트")
    void testStrongBox() {
        //given
        StrongBox<String> box = new StrongBox<>(PADLOCK);
        // then
        assertEquals(0, box.getCount());
        assertEquals(PADLOCK, box.getKeyType());
    }

    @Test
    @DisplayName("get 메서드 테스트")
    void testStrongBoxGet() {
        //given
        StrongBox<String> box = new StrongBox<>(PADLOCK);
        box.put("PADLOCK");
        box.get();

        assertEquals(1, box.getCount());
        assertEquals(null, box.get());
        assertEquals(2, box.getCount());
    }

    @Test
    @DisplayName("get 메서드 테스트")
    void testStrongBoxGet2() {
        //given
        StrongBox<String> box = new StrongBox<>(PADLOCK);
        box.put("PADLOCK");

        for (int i = 0; i < 1024; i++) {  //1024번째까지는 null
            assertNull(box.get());
        }
        assertEquals(1024, box.getCount());

        assertEquals("PADLOCK", box.get());  //여기서 호출하는 것도 count에 포함
        assertEquals(1025, box.getCount());
    }

    @Test
    @DisplayName("BUTTON get 메서드 테스트")
    void testStrongBox_BUTTONGet() {
        //given
        StrongBox<String> box = new StrongBox<>(BUTTON);
        box.put("버튼");

        for (int i = 0; i < 10000; i++) {
            assertNull(box.get());
        }
        assertEquals(10000, box.getCount());

        assertEquals("버튼", box.get());
        assertEquals(10001, box.getCount());
    }

    @Test
    @DisplayName("DIAL get 메서드 테스트")
    void testStrongBox_DIALGet() {
        //given
        StrongBox<String> box = new StrongBox<>(DIAL);
        box.put("DIAL");

        for (int i = 0; i < 30000; i++) {
            assertNull(box.get());
        }
        assertEquals(30000, box.getCount());

        assertEquals("DIAL", box.get());
        assertEquals(30001, box.getCount());
    }

    @Test
    @DisplayName("FINGER get 메서드 테스트")
    void testStrongBox_FINGERGet() {
        //given
        StrongBox<String> box = new StrongBox<>(FINGER);
        box.put("FINGER");

        for (int i = 0; i < 1000000; i++) {
            assertNull(box.get());
        }
        assertEquals(1000000, box.getCount());

        assertEquals("FINGER", box.get());
        assertEquals(1000001, box.getCount());
    }

}