package com.survivalcoding.Asset;

import com.survivalcoding.Asset.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book("Jerry", 35000, "Orange", 3, 12345);

    @Test
    @DisplayName("Asset 클래스의 name 입출력 확인")
    void name() {
        String input = "종이컵";
        book.setName(input);
        assertEquals(input, book.getName());
    }

    @Test
    @DisplayName("Asset 클래스의 price 입출력 확인")
    void price() {
        int input = 35000;
        book.setPrice(input);
        assertEquals(input, book.getPrice());
    }

    @Test
    @DisplayName("TangibleAsset 클래스의 color 입출력 확인")
    void color() {
        String input = "검정색";
        book.setColor(input);
        assertEquals(input, book.getColor());
    }

    @Test
    @DisplayName("TangibleAsset 클래스의 weight 입출력 확인")
    void weight() {
        double input = 3.5;
        book.setWeight(input);
        assertEquals(input, book.getWeight());
    }

    @Test
    @DisplayName("Book 클래스의 isbn 입출력 확인")
    void isbn() {
        int input = 5678910;
        book.setIsbn(input);
        assertEquals(input, book.getIsbn());
    }
}