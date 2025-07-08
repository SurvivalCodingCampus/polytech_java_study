package com.survivalcoding.assignments_01_instance.exam01.Instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("제목과 출간일이(예: 2024-01-01) 같으면 같은 책으로 판단한다")
    void TitleDate() {
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
        books.add(book1);
        books.remove(book2);
        assertEquals(0, books.size());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.remove(book2);
        assertEquals(0, bookSet.size());
    }
        @Test
        @DisplayName("Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다")
        void PublishDate(){
        Book book1=new Book("제목1", new Date(2024, 3, 1), "comment1");
        Book book2=new Book("제목2", new Date(2024, 1, 1), "comment2");
        Book book3=new Book("제목3", new Date(2024, 2, 1), "comment3");
        Book book4=new Book("제목4", new Date(2024, 4, 1), "comment4");

        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Collections.sort(books);
        assertEquals(book4, books.get(0));


        }
    }
