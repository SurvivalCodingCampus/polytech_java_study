package com.survivalcoding.Asset;

import com.survivalcoding.Asset.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book();

    @Test
    @DisplayName("Asset 클래스의 name 출력 확인")
    void name() {
        String input = "종이컵";
        book.setName(input);
        assertEquals(input, book.getName());
    }
}