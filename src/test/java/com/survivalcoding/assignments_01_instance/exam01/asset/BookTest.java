package com.survivalcoding.assignments_01_instance.exam01.asset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    @Test
    @DisplayName("제대로 됐을까요")
    void getName() {
        Book book = new Book("책", 100, "빨", 3.5, "A");

        assertEquals("책", book.getName());
    }

}