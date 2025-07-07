package com.survivalcoding.instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("clone()을 사용하여 객체 생성 시, 참조 메서드의 메모리가 별개로 생성되어야 함")
    void testClone() throws CloneNotSupportedException {
        Book base = new Book("Base", 2025, 7, 7, "First Commit");
        Book cloned = (Book) base.clone();

        cloned.setPublishDate(2025, 3, 21);

        assertEquals(base.getTitle(), cloned.getTitle());
        assertEquals(base.getComment(), cloned.getComment());
        assertNotEquals(cloned.getPublishDate(), base.getPublishDate());
    }

    @Test
    @DisplayName("책 이름과 출간 날짜가 같다면 동일한 책으로 간주. Comment는 무관")
    void testEquals() {
        Book first = new Book("First");
        Book second = new Book("Second", 2025, 3, 1);
        Book third = new Book("First");
        third.setComment("Third Comment");

        assertEquals(true, first.equals(third));
        assertEquals(false, first.equals(second));
    }

    @Test
    @DisplayName("Hash Map/Set 사용 시 책 이름과 출간 날짜가 같다면 동일한 책으로 간주. Comment는 무관")
    void testHashCode() {
        Set<Book> bookSet = new HashSet<>();

        Book first = new Book("First");
        Book second = new Book("Second", 2025, 3, 1);
        Book third = new Book("First"); // first와 책 이름, 날짜 동일
        third.setComment("Third Comment");

        bookSet.add(first);
        bookSet.add(second);
        bookSet.add(third);

        assertEquals(2, bookSet.size());
    }
}