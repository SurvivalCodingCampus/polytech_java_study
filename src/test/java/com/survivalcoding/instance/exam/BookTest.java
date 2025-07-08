package com.survivalcoding.instance.exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다")
    void shouldConsiderBooksWithSameTitleAndPublicationDateAsEqual() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 1);

        Date date1 = calendar.getTime();

        calendar.set(Calendar.MINUTE, 2);

        Date date2 = calendar.getTime();

        Book book1 = new Book("제목", date1, "comment1");
        Book book2 = new Book("제목", date2, "comment2");

        System.out.println(book1.getPublishDate().equals(book2.getPublishDate()));

        assertEquals(book1, book2);

        List<Book> books = new ArrayList<>();
        books.add(book1);   // 1
        books.remove(book2);    // 0
        assertEquals(0, books.size());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);   // 1
        bookSet.remove(book2);    // 0
        assertEquals(0, bookSet.size());
    }
}