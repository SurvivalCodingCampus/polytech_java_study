package com.survivalcoding.assignments_01_instance.exam01.Instance;

import java.time.LocalDateTime;

public class Book implements Comparable<Book> {
    private String title;
    private LocalDateTime publishDate;
    private String comment;

    // 제목과 출간일이(예: 2024-01-01) 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
public Book(String title, LocalDateTime publishDate, String comment){

}

    // Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다
    @Override
    public int compareTo(Book book) {
        return book.publishDate.compareTo(this.publishDate);
    }
}

//clone() 메서드를 제공하고, 깊은 복사를 수행한다
