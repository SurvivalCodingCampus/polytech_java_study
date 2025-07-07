package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
class BookTest {

    @Test
    void listtest() {
        List<Book> booksList = new ArrayList<>();

        Date date1 = new Date(2025, 7, 7);
        Date date2 = new Date(2025, 7, 7);

        Book book1 = new Book("book1", date1, "123");
        Book book2 = new Book("book1", date2, "456");

        booksList.add(book1);
        System.out.println(booksList.size());

        booksList.remove(book2);
        System.out.println(booksList.size());

        System.out.println(book1.equals(book2));

    }

    @Test
    void settest(){

        Date date1 = new Date(2025,7,7);
        Date date2 = new Date(2025, 7, 7);

        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("book1", date1, "123");
        Book book2 = new Book("book1", date2, "456");

        bookSet.add(book1);
        System.out.println(bookSet.size());

        bookSet.remove(book2);
        System.out.println(bookSet.size());

        System.out.println(book1.equals(book2));
    }

}