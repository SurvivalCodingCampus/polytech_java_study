package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class Book2Test {

    @Test
    @DisplayName("같은 제목, 출간일이면 equals은 true")
    void equalsTest() {
        Date date = new Date();
        Book2 book1 = new Book2("name", date, "가");
        Book2 book2 = new Book2("name", date, "나");

        assertTrue(book1.equals(book2));
    }

}