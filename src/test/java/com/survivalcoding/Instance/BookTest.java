package com.survivalcoding.Instance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {
    private final List<Book> testBooks = new ArrayList<>();

    @BeforeEach
    void setUp() {
        testBooks.clear();
        testBooks.add(new Book("자바의 정석", new Date(120, 0, 15, 10, 10, 10), "프로그래밍 입문서"));
        testBooks.add(new Book("자바의 정석", new Date(120, 0, 15, 9, 10, 10), "프로그래밍 입문서 2"));
        testBooks.add(new Book("스프링 부트 실전 가이드", new Date(123, 4, 20), "웹 개발 심화서"));
        testBooks.add(new Book("이펙티브 자바", new Date(118, 11, 27), "자바 고급 기법"));

    }

    @Test
    @DisplayName("온라인 상점 신간 도서 정렬")
    void testOnlineBookstoreSorting() {
        List<Book> newBooks = new ArrayList<>(testBooks);

        System.out.println("🛒 시나리오: 온라인 서점 신간 도서 정렬");
        System.out.println("=== 입고 순서 ===");
        for (int i = 0; i < newBooks.size(); i++) {
            System.out.println((i + 1) + ". " + newBooks.get(i).getTitle() +
                    " (" + (newBooks.get(i).getPublishDate().getYear() + 1900) + "년)");
        }

        // When: 신간순으로 정렬 (최신이 먼저)
        Collections.sort(newBooks);

        System.out.println("\n=== 신간순 정렬 (베스트셀러 코너 진열 순서) ===");
        for (int i = 0; i < newBooks.size(); i++) {
            System.out.println((i + 1) + ". " + newBooks.get(i).getTitle() +
                    " (" + (newBooks.get(i).getPublishDate().getYear() + 1900) + "년)");
        }

        // Then: 정렬 결과 검증
        // 가장 최신 책이 첫 번째에 와야 함
        assertEquals("스프링 부트 실전 가이드", newBooks.get(0).getTitle(),
                "가장 최신 책이 첫 번째에 와야 합니다");

        // 가장 오래된 책이 마지막에 와야 함
        assertEquals("이펙티브 자바", newBooks.get(newBooks.size() - 1).getTitle(),
                "가장 오래된 책이 마지막에 와야 합니다");

        // 연도별 순서 확인
        assertTrue(newBooks.get(0).getPublishDate().after(newBooks.get(1).getPublishDate()),
                "첫 번째 책이 두 번째 책보다 최신이어야 합니다");

        // 전체 책 개수 유지 확인
        assertEquals(4, newBooks.size(), "정렬 후에도 책 개수는 유지되어야 합니다");

        System.out.println("\n신간순 정렬 테스트 통과!");

    }

    @Test
    @DisplayName("제목과 출간일(ex: 2024-01-01)이 같으면 같은 책으로 판단한다")
    void shouldCOnsiderBooksWithSameTitleAndPublicationDateAsEqual() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 1);
        calendar.set(Calendar.MINUTE, 1);

        Date date1 = calendar.getTime();

        calendar.set(Calendar.MINUTE, 2);

        Date date2 = calendar.getTime();

        Book book1 = new Book("제목", date1, "Comment1");
        Book book2 = new Book("제목", date2, "Comment2");


        System.out.println(book1.getPublishDate().equals(book2.getPublishDate()));
        assertEquals(book1, book2);

        List<Book> books = new ArrayList<>();
        books.add(book1); // 1
        books.remove(book2); // 0
        assertEquals(0, books.size());

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);   // 1
        bookSet.remove(book2);    // 0
        assertEquals(0, bookSet.size());


    }

}