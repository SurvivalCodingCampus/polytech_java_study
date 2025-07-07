package com.survivalcoding.BookTest;

import com.survivalcoding.Book.Book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    void setDate() {
        Date[] date = new Date[4];

        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.JULY, 7, 10, 10);
        date[0] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 7, 10, 10);
        date[1] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 5, 10, 10);
        date[2] = calendar.getTime();

        calendar.set(2025, Calendar.JULY, 3, 10, 10);
        date[3] = calendar.getTime();
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

        // assertNotEquals(book.equals(copy));

        assertEquals(currentDate, copy.getPublishDate());
        assertEquals(sourceComment, copy.getComment());
    }

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책인지 판단")
    void testSamePublishDate() {
        // given, when
        boolean result1 = book1.equals(book2);

        // then
        assertTrue(result1);
    }

    @Test
    @DisplayName("publishDate 기준 정렬")
    void testDescendOrderPublishDate() {
        // given
        bookList.add(book1);
        bookList.add(book3);
        bookList.add(book4);

        // when
        Collections.sort(bookList);

        // then
        for (int i = 0; i < bookList.size(); ++i) {
            assertEquals(date[i], bookList.get(i).getPublishDate());
        }
    }
}
