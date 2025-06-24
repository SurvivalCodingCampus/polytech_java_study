package com.survivalcoding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    @DisplayName("책 생성 테스트")
    void testBook(){
        Book book = new Book("진현규가썼음","책제목", 1234, "파란색", "대원");
        assertEquals("진현규가썼음", book.getPatent());
        assertEquals(book.getName(),"책제목");
        assertEquals(book.getPrice(),1234);
        assertEquals(book.getColor(), "파란색");
        assertEquals(book.getIsbn(), "대원");
    }
}