package com.survivalcoding.assignments_01_instance.exam01.instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class BookTest {

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책_List")
    void testBook_equals() {
        //given
        Book book1 = new Book("AA", new Date(2025, 7, 7, 10, 30));
        Book book2 = new Book("AA", new Date(2025, 7, 7, 22, 45));

        // then
        assertEquals(true, book1.equals(book2));
    }


    @Test
    @DisplayName("시간이 달라도 같은 날짜면 같은 책_Set,Map")
    void testBook_hashCode() {
        //given
        Book book1 = new Book("AA", new Date(2025, 7, 7, 10, 30));
        Book book2 = new Book("AA", new Date(2025, 7, 7, 22, 45));

        int h1 = book1.hashCode();
        int h2 = book2.hashCode();

        // then
        assertEquals(true, h1 == h2);
    }

    @Test
    @DisplayName("출간일이 신상 순서대로 정렬")
    void testBook_compareTo() {
        //given
        List<Book> books = new ArrayList<>();

        books.add(new Book("AA", new Date(2025, 7, 7, 10, 30)));
        books.add(new Book("BB", new Date(2025, 7, 9, 10, 30)));
        books.add(new Book("CC", new Date(2025, 7, 8, 10, 30)));

        Collections.sort(books);

        // then
        assertEquals("BB", books.get(0).getTitle());
        assertEquals("CC", books.get(1).getTitle());
        assertEquals("AA", books.get(2).getTitle());

    }

    @Test
    void testPublishDateIsDeepCopied() {
        // given: 원본 Book 객체 생성
        Book book1 = new Book("AA", new Date(2025, 7, 7, 10, 30));

        // when: 복사본 생성
        Book copy = book1.clone();

        // then: 서로 다른 인스턴스인지 확인
        assertNotSame(book1.getPublishDate(), copy.getPublishDate(), "Date 객체는 깊은 복사되어야 하므로 서로 다른 인스턴스여야 함");

        // 값을 바꾸고 원본과 비교
        copy.setPublishDate(new Date(2025, 7, 9, 10, 30));

        // 원본은 여전히 현재 시각이어야 함
        assertEquals(false, book1.getPublishDate().equals(copy.getPublishDate()));
    }

}