package com.survivalcoding.Books;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class Book_2Test {


    @Test
    @DisplayName("책 생성 테스트")
    void testBook() {
        Date date = new Date();

        Book_2 book2 = new Book_2("책이름1","진현규1");
        assertEquals("책이름1", book2.getTitle());
        assertEquals("진현규1", book2.getComment());

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, book2.getPublishDate().getYear());
        calendar.set(Calendar.MARCH, book2.getPublishDate().getMonth());
        calendar.set(Calendar.DATE, book2.getPublishDate().getDate());

        assertEquals(date.getYear(), book2.getPublishDate().getYear());
        assertEquals(date.getMonth(), book2.getPublishDate().getMonth());
        assertEquals(date.getDate(), book2.getPublishDate().getDate());

        Book_2 book3 = book2;

        Set<Book_2> set = new HashSet<>();

        set.add(book2);
        set.add(book3);

        assertEquals(1, set.size());


        Book_2 book5 = new Book_2("책이름5","진현규5");
        Book_2 book6 = new Book_2("책이름6","진현규6");
        Book_2 book7 = new Book_2("책이름7","진현규7");

        int a = book5.getPublishDate().compareTo(book6.getPublishDate());



        //깊은 복사
        Book_2 book8 = new Book_2("책이름8","진현규8");
        Book_2 book9 = book8.clone();

        assertFalse(book9 == book8);
    }

}