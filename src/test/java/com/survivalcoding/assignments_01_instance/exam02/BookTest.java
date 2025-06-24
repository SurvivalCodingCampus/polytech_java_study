package com.survivalcoding.assignments_01_instance.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test
    @DisplayName("Book 생성 테스트")
    void createBook() {

        //given
        String name = "책";
        long price = 1_000L;
        Color color = Color.BLUE;
        double weight = 1.0;
        String isbn = "978-89-1234-567-8";

        //when
        Book book = new Book(name, price, color, weight, isbn);

        //then
        assertInstanceOf(Asset.class, book);
        assertInstanceOf(TangibleAsset.class, book);
        assertEquals(name, book.getName());
        assertEquals(price, book.getPrice());
        assertEquals(color, book.getColor());
        assertEquals(weight, book.getWeight());
        assertEquals(isbn, book.getIsbn());
    }

}