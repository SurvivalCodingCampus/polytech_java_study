package com.survivalcoding.BookTest;

import com.survivalcoding.Book.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private Date[] dates;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private List<Book> bookList;

    @BeforeEach
    void setDate() {
        dates = new Date[4];
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.JULY, 7, 10, 10, 0);
        dates[0] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 7, 11, 10, 0);
        dates[1] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 5, 10, 10, 0);
        dates[2] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 3, 10, 10, 0);
        dates[3] = calendar.getTime();

        book1 = new Book("book1", dates[0], "comment1");
        book2 = new Book("book1", dates[1], "comment2");
        book3 = new Book("book3", dates[2], "comment3");
        book4 = new Book("book4", dates[3], "comment4");
    }

    @Test
    @DisplayName("생성자 테스트")
    void testBookConstructor() {
        // given, when
        Date currentDate = new Date();
        Book book = new Book("book", currentDate, "비싼 책");

        // then
        assertEquals("book", book.getTitle());
        assertEquals(currentDate, book.getPublishDate());
        assertEquals("비싼 책", book.getComment());
    }

    @Test
    @DisplayName("깊은 복사 테스트")
    void testDeepCopy() {
        // given
        Date currentDate = new Date();
        String sourceTitle = "book";
        String sourceComment = "비싼 책";
        Book book = new Book(sourceTitle, currentDate, sourceComment);

        // when
        Book copy = book.clone();

        // then
        assertNotSame(book, copy); // 같은 주소를 가지는 지 비교

        assertEquals(currentDate, copy.getPublishDate());
        assertNotSame(book.getPublishDate(), copy.getPublishDate());

        assertEquals(sourceComment, copy.getComment());
    }

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책인지 판단")
    void testSamePublishDate() {
        // given, when
        boolean result = book1.equals(book2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("publishDate 기준 정렬")
    void testDescendOrderPublishDate() {
//        // given
//        bookList.add(book1);
//        bookList.add(book3);
//        bookList.add(book4);
//
//        // when
//        Collections.sort(bookList);
//
//        // then
//        assertEquals(book1, bookList.get(0));
//        assertEquals(book3, bookList.get(1));
//        assertEquals(book4, bookList.get(2));
    }
}
