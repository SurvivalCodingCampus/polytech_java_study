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
    @DisplayName("제목과 출간일이 같으면 같은 책으로 판단한다 set")
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

    @Test
    @DisplayName("신상 순서대로 정렬하자")
    void BookTest3() {
        //given
        Date date = new Date();
        Date date1 = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("2025-05-04");
        SimpleDateFormat sdf2 = new SimpleDateFormat("2025-06-04");

        String formatDate = sdf1.format(date);
        String formatDate2 = sdf2.format(date1);

        Book book1 = new Book("ABC", date, "NoComment");
        Book book2 = new Book("DEF", date1, "Comment");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        Collections.sort(bookList);
        System.out.println(bookList);
    }

    @Test
    @DisplayName("주소가 다른지 보자")
    void BookTest4() {
        //given
        Date date = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("2025-05-04");
        String formatDate = sdf1.format(date);
        Book book = new Book("AVC", date, "comments");
        Book book2 = book.clone();

        //then
        assertEquals(true, book != book2);


    }

}