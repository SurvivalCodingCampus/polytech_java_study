package com.survivalcoding.BoxTest;

import com.survivalcoding.Box.StrongBox;
import com.survivalcoding.Box.PADLOCK;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoxTest {
    @Test
    @DisplayName("PADLOCK")
    void testPadlockUnlock() {
        // Given
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyKind.PADLOCK);
        String secret = "My Secret Doc";
        box.put(secret);

        // when
        for (int i=0; i<1023; ++i) {
            assertNull(box.get());
            assertEquals(i+1, box.getUseCnt());
        }
        box.get();

        // then
        assertEquals(1024, box.getUseCnt());
        assertEquals(secret, box.get());
    }

    @Test
    @DisplayName("FINGER")
    void testFingerLockInitialState() {
        // Given
        StrongBox<Integer> box = new StrongBox<>(StrongBox.KeyKind.FINGER);
        int num = 1;
        box.put(num);

        // When
        assertNull(box.get());

        // Then
        assertEquals(1, box.getUseCnt());
        assertNull(box.get());
        assertEquals(2, box.getUseCnt());
    }

    @Test
    @DisplayName("다른 종류의 열쇠로 금고 생성 및 내용 확인")
    void testStrongBoxWithDifferentKeyTypes() {
        // Given
        StrongBox<Double> dialBox = new StrongBox<>(StrongBox.KeyKind.DIAL);
        double piValue = 3.141592;
        dialBox.put(piValue);

        StrongBox<Boolean> buttonBox = new StrongBox<>(StrongBox.KeyKind.BUTTON);
        boolean isTrue = true;
        buttonBox.put(isTrue);

        // When(DIAL)
        assertNull(dialBox.get());
        assertEquals(1, dialBox.getUseCnt());

        // When(BUTTON)
        assertNull(buttonBox.get());
        assertEquals(1, buttonBox.getUseCnt());
    }
}
