package com.survivalcoding;

import com.survivalcoding.strongBox.KeyType;
import com.survivalcoding.strongBox.StrongBox;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    @Test
    @DisplayName("Put a content into the StrongBox")
    void testPutContentIntoStrongBox() {
        StrongBox<String> strongBox = new StrongBox<>();

        // Before put
        assertNull(strongBox.get());
        assertNull(strongBox.getKeyType());

        strongBox.put("YES.");
        strongBox.setKeyType(KeyType.BUTTON);

        // After put with KeyType.BUTTON lock
        assertNull(strongBox.get());
        assertEquals(KeyType.BUTTON, strongBox.getKeyType());
    }

    @Test
    @DisplayName("Open a padlocked StrongBox")
    void testOpenStrongBox() {
        StrongBox<String> strongBox = new StrongBox<>("NO.", KeyType.PADLOCK);

        for (int i = 0; i < 1024; i++) {
            assertNull(strongBox.get());
        }

        assertEquals("NO.", strongBox.get());
    }
}