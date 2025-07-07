package com.survivalcoding.generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    @Test
    @DisplayName("PADLOCK을 넣어 keyType, keyCount 확인")
    void inputKeyTypePADLOCK() {
        StrongBox<String> box = new StrongBox<>("GOLD", "PADLOCK");
        KeyType resKey = KeyType.PADLOCK;
        int resKeyCount = box.getPadlock();

        assertEquals(resKey, box.getKey());
        assertEquals(resKeyCount, box.getKeyCount());
    }

    @Test
    @DisplayName("BUTTON을 넣어 keyType, keyCount 확인")
    void inputKeyTypeBUTTON() {
        StrongBox<String> box = new StrongBox<>("GOLD", "BUTTON");
        KeyType resKey = KeyType.BUTTON;
        int resKeyCount = box.getButton();

        assertEquals(resKey, box.getKey());
        assertEquals(resKeyCount, box.getKeyCount());
    }

    @Test
    @DisplayName("DIAL을 넣어 keyType, keyCount 확인")
    void inputKeyTypeDIAL() {
        StrongBox<String> box = new StrongBox<>("GOLD", "DIAL");
        KeyType resKey = KeyType.DIAL;
        int resKeyCount = box.getDial();

        assertEquals(resKey, box.getKey());
        assertEquals(resKeyCount, box.getKeyCount());
    }

    @Test
    @DisplayName("FINGER을 넣어 keyType, keyCount 확인")
    void inputKeyTypeFINGER() {
        StrongBox<String> box = new StrongBox<>("GOLD", "FINGER");
        KeyType resKey = KeyType.FINGER;
        int resKeyCount = box.getFinger();

        assertEquals(resKey, box.getKey());
        assertEquals(resKeyCount, box.getKeyCount());
    }

    @Test
    @DisplayName("잘못된 KeyType을 넣었을 시 오류 확인")
    void inputKeyTypeMiss() {
        assertThrows(IllegalArgumentException.class, () -> {
            StrongBox<String> box = new StrongBox<>("GOLD", "Miss");
        });
    }

    @Test
    @DisplayName("get() 호출 시 useKeyCount 1씩 증가")
    void useKeyCount() {
        StrongBox<String> box = new StrongBox<>("GOLD", "DIAL");
        int i = 0;
        for (i = 0; i < 5; i++) {
            box.getInstance();
        }

        assertEquals(box.getUseKeyCount(), i);
    }

    @Test
    @DisplayName("get() 호출 시 KeyCount를 모두 쓰면 인스턴스를 얻을 수 있음")
    void getInstance() {
        String instance = "GOLD";
        StrongBox<String> box = new StrongBox<>(instance, "PADLOCK");
        int top = box.getKeyCount();
        String res;

        for (int i = 0; i <= top; i++) {
            box.getInstance();
        }

        assertEquals(instance, box.getInstance());
    }
}