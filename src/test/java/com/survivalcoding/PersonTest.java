package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("check whether getAge() works correctly")
    public void testGetAge() {
        Person clark = new Person("Clark", 1988);
        assertEquals(37, clark.getAge());
    }
}