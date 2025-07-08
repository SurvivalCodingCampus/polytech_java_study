package com.survivalcoding.nine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class BookTest {
    @Test
    @DisplayName("생성자, getter, setter 테스트")
    void testBookCreationAndGetters() {
        LocalDateTime publishDate = LocalDateTime.now();

        Book book = new Book("Title1", publishDate, "Comment1");

        assertEquals("Title1", book.getTitle());
        assertEquals(publishDate, book.getPublishDate());
        assertEquals("Comment1", book.getComment());
    }

    @Test
    @DisplayName("서로 다른 객체지만 날짜와 타이틀이 같으면 동일 객체")
    void testEqualsAndHashSetBehavior() {
        LocalDateTime publishDate = LocalDateTime.of(2020, 1, 1, 10, 10, 10);

        Book book1 = new Book("1", publishDate, "asd");
        Book book2 = new Book("1", publishDate, "www");

        assertEquals(book1, book2);

        // HashSet에 넣으면 중복으로 처리되어 크기는 1이어야 함
        Set<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        assertEquals(1, set.size());
    }

    @Test
    @DisplayName("같은 날짜와 다른 시간 비교")
    void testDifferentDate() {
        LocalDateTime publishDate = LocalDateTime.of(2020, 1, 1, 10, 10, 10);
        LocalDateTime publishDate2 = LocalDateTime.of(2020, 1, 1, 9, 9, 9);
        Book book1 = new Book("1", publishDate, "asd");
        Book book2 = new Book("1", publishDate2, "www");

        assertEquals(book1, book2);

        // HashSet에 넣으면 중복으로 처리되어 크기는 1이어야 함
        Set<Book> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        assertEquals(1, set.size());
    }

    @Test
    @DisplayName("깊은 복사 진행")
    void testCloneCreatesDeepCopy() {
        //Date originalDate = ;
        Book original = new Book("Original", LocalDateTime.now(), "Original comment");
        Book cloned = original.clone();

        // 내용은 같아야 함
        assertEquals(original, cloned);

        // 같은 참조는 아니어야 함 (특히 Date 객체)
        assertEquals(original.getTitle(), cloned.getTitle());
        assertEquals(original.getPublishDate(), cloned.getPublishDate());
        assertEquals(original.getComment(), cloned.getComment());

        // 복사한 객체의 필드 변경 시 원본에 영향 없어야 함
        cloned.setComment("Changed comment");
        assertNotSame(original.getComment(), cloned.getComment());
    }
}