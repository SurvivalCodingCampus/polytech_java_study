package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책으로 판단한다 List")
    void BookTest1() {

        //given
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = sdf.format(date);
        Book book1 = new Book("ABC", date, "NoComment");
        Book book2 = new Book("ABC", date, "No");

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.remove(book2);

        //then
        assertEquals(0, bookList.size());
    }

    @Test
    @DisplayName("제목과 출간일이 같으면 같은 책으로 판단한다 List")
    void BookTest2() {

        //given
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = sdf.format(date);
        Book book1 = new Book("ABC", date, "NoComment");
        Book book2 = new Book("ABC", date, "No");

        Set<Book> bookSet = new HashSet<>() {
        };

        bookSet.add(book1);
        bookSet.add(book2);

        //then
        assertEquals(1, bookSet.size());
    }
}