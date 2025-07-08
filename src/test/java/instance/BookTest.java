package instance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("equals 테스트")
    void equalsTest() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.JULY, 7);

        Date publicshDate = new Date(2024, 1, 1);
        Date publicshDate2 = calendar.getTime();
        Date now = new Date();
        Book book1 = new Book("명품 C++", publicshDate, "난이도 : 중");
        Book book2 = new Book("명품 C++", publicshDate, "난이도 : 상");
        assertEquals(true, book1.equals(book2));

        book1.setPublishDate(now);
        book2.setPublishDate(publicshDate2);

        assertEquals(true, book1.equals(book2));

        book2.setTitle("C언어");
        assertEquals(false, book1.equals(book2));

    }

    @Test
    @DisplayName("hashEquals 테스트")
    void hashEqualsTest() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.JULY, 7);
        Date publicshDate = new Date(2024, 1, 1);
        Date publicshDate2 = calendar.getTime();
        Date now = new Date();

        Book book1 = new Book("명품 C++", publicshDate, "난이도 : 중");
        Book book2 = new Book("명품 C++", publicshDate, "난이도 : 상");

        Set<Book> bookSet = new HashSet<>();

        bookSet.add(book1);
        assertEquals(1, bookSet.size());

        bookSet.remove(book2);

        assertEquals(0, bookSet.size());

        book1.setPublishDate(now);
        book2.setPublishDate(publicshDate2);

        bookSet.add(book1);
        assertEquals(1, bookSet.size());

        bookSet.remove(book2);
        assertEquals(0, bookSet.size());

    }

    @Test
    @DisplayName("정렬 Test")
    void bookSortTest(){
        Date publicshDate = new Date(2024, 1, 1);
        Book book1 = new Book("명품 C++", new Date(2024, 6, 1), "난이도 : 중");
        Book book2 = new Book("자바", new Date(2024, 1, 2), "난이도 : 상");
        Book book3 = new Book("경제", new Date(2023, 1, 2), "난이도 : 하");
        Book book4 = new Book("사전", new Date(2025, 1, 2), "난이도 : 상");

        //Set<Book> bookSet = new HashSet<>();
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        Collections.sort(bookList);

        assertEquals(book4, bookList.get(0));
        assertEquals(book1, bookList.get(1));
        assertEquals(book2, bookList.get(2));
        assertEquals(book3, bookList.get(3));

    }
}