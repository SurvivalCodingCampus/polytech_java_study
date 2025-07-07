package instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("equals 테스트")
    void equalsTest() {
        LocalDate publicshDate = LocalDate.of(2024, 1,1);
        Book book1 = new Book("명품 C++", publicshDate,"난이도 : 중");
        Book book2 = new Book("명품 C++", publicshDate,"난이도 : 상");
        assertEquals(true, book1.equals(book2));

        book2.setTitle("C언어");
        assertEquals(false, book1.equals(book2));
    }

    @Test
    @DisplayName("hashEquals 테스트")
    void hashEqualsTest() {
        LocalDate publicshDate = LocalDate.of(2024, 1,1);
        Book book1 = new Book("명품 C++", publicshDate,"난이도 : 중");
        Book book2 = new Book("명품 C++", publicshDate,"난이도 : 상");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.remove(book2);

        assertEquals(0, bookSet.size());
    }
}