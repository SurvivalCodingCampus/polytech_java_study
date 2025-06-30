package com.survivalcoding.Asset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    @DisplayName("Book 객체 생성 및 필드값 검증")
    void testBookCreationAndField() {
        //given
        String expectedName = "자바 정복";
        int expectedPrice = 25000;
        String expectedColor = "파란색";
        double expectedWeight = 5;
        String expectedIsbn = "123-45-6789";
        //when
        Book book = new Book(expectedName, expectedPrice, expectedColor, expectedWeight, expectedIsbn);

        // then
        assertEquals(expectedName, book.getName());
        assertEquals(expectedPrice, book.getPrice());
        assertEquals(expectedColor, book.getColor());
        assertEquals(expectedWeight, book.getWeight());
        assertEquals(expectedIsbn, book.getIsbn());

    }

}