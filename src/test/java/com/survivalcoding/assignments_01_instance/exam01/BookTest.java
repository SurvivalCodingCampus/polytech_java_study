package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("생성자를 통해 name, price, color, isbn이 잘 설정됐는지 테스트")
    void bookAllFieldCorrectly() {

        Book book = new Book("name", 10000, "color", "isbn");

        assertEquals("name",book.getName());
        assertEquals(10000, book.getPrice());
        assertEquals("color", book.getColor());
        assertEquals("isbn", book.getIsbn());
    }

}