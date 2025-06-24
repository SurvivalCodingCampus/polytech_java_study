package com.survivalcoding.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookTest {
    Book book;

    @BeforeEach
    void setUp() {
        book = new Book(
                "학교에서 알려주는 cs 지식",
                17000,
                "green",
                1.2,
                "333"
        );
    }

    @Test
    @DisplayName("Book 클래스 생성자 테스트")
    public void testBook() {
        assertEquals("학교에서 알려주는 cs 지식", book.getName());
        assertEquals(17000, book.getPrice());
        assertEquals("green", book.getColor());
        assertEquals(1.2, book.getWeight());
        assertEquals("333", book.getIsbn());
    }

    @Test
    @DisplayName("Book throw 체크")
    public void testBookThrow() {
        assertThrows(IllegalArgumentException.class, () -> book.setName(null));
        assertThrows(IllegalArgumentException.class, () -> book.setPrice(-20));
        assertThrows(IllegalArgumentException.class, () -> book.setColor(null));
        assertThrows(IllegalArgumentException.class, () -> book.setWeight(-20));
        assertThrows(IllegalArgumentException.class, () -> book.setIsbn(null));
    }
}