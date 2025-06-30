package com.survivalcoding.asseting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    @DisplayName("책 생성 테스트")
    void testBook() {
        Book book = new Book("책제목", 1234, "파란색", 12.3, "대원");
        assertEquals("책제목", book.getName());
        assertEquals(1234, book.getPrice());
        assertEquals("파란색", book.getColor());
        assertEquals(12.3, book.getWeight());
        assertEquals("대원", book.getIsbn());
    }
}