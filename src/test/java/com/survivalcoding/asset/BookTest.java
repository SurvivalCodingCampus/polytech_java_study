package com.survivalcoding.asset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("Set<Book> ( hashCode() ) 테스트")
    public void testSetBook() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, 7, 7, 16, 28, 32);
        Date date = calendar.getTime();

        Set<Book> books = new HashSet<>();
        Book book1 = new Book(
                "산나비",
                3000,
                "황금",
                0.6,
                "1234567890",
                date
        );

        calendar.set(Calendar.MINUTE, 32);
        Book book2 = new Book(
                "산나비",
                3000,
                "황금",
                0.6,
                "1234567890",
                date
        );

        book1.setComment("Yes.");
        book2.setComment("No.");

        books.add(book1);
        books.add(book2);
        assertEquals(1, books.size());
    }

    @Test
    @DisplayName("equals() 테스트")
    public void testListBook() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, 7, 7, 16, 28, 32);
        Date date = calendar.getTime();

        List<Book> books = new ArrayList<>();
        Book book1 = new Book(
                "산나비",
                3000,
                "황금",
                0.6,
                "1234567890",
                date
        );

        calendar.set(Calendar.MINUTE, 32);
        Book book2 = new Book(
                "산나비",
                3000,
                "황금",
                0.6,
                "1234567890",
                date
        );

        book1.setComment("Yes.");
        book2.setComment("No.");

        books.add(book1);
        books.remove(book2);

        assertTrue(book1.equals(book2));
        assertEquals(0, books.size());
    }

    @Test
    @DisplayName("Clone 테스트")
    public void testCloning() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, 7, 7, 16, 28, 32);
        Date date = calendar.getTime();

        Book book1 = new Book(
                "산나비",
                3000,
                "황금",
                0.6,
                "1234567890",
                date
        );
        Book book2 = book1.clone();

        // 참조 주소 비교
        assertFalse(book1 == book2);

        // 오버라이드 된 equals() 비교 : 제목과 출간일이 동일하면 동일한 객체 취급
        assertTrue(book1.equals(book2));

        // 오버라이드 된 hashCode() 비교 : 규칙은 위와 동일
        assertTrue(book1.hashCode() == book2.hashCode());

        // clone 된 book2 는 동일한 Date 객체를 book1 과 함께 쓰는가?
        assertFalse(book1.getPublishDate() == book2.getPublishDate());
    }
}