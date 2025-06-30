package com.survivalcoding.AssetTest;

import com.survivalcoding.Asset.TangibleAsset;
import com.survivalcoding.Asset.Book;
import com.survivalcoding.Asset.Computer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TangibleAssetTest {
    Book book = new Book("KJY", "학교에서 ", 1234, "Red", "출판사", 1.0);
    Computer com = new Computer("KJY", "맥", 1234, "Silver", "애플", 5);

    @Test
    @DisplayName("책의 출판사 get, set")
    void bookTest() {
        book.setIsbn("출판사1");
        assertEquals("출판사1", book.getIsbn());
    }

    @Test
    @DisplayName("컴 브랜드 get, set")
    void comTest() {
        com.setMakeName("삼성");
        assertEquals("삼성", com.getMakeName());
    }

    @Test
    @DisplayName("유형자산 메서드 테스트")
    void TangibleAssetMethodTest() {
        book.setColor("Blue");
        assertEquals("Blue", book.getColor());

        book.setWeight(2);
        assertEquals(2, book.getWeight());

        assertEquals("학교에서 ", book.getName());
        assertEquals(1234, book.getPrice());
    }
}
