package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책으로 판단한다.")
    void BookTest1() {
        //given
        Book book1 = new Book("ABC", LocalDate.of(2025, 07, 07), "NoComment");
        Book book2 = new Book("ABC", LocalDate.of(2025, 07, 07), "NoCo");
        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.remove(book2);

        //then
        assertEquals(0, bookList.size());
    }

}