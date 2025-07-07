package com.survivalcoding.assignments_01_instance.exam01.instance;

import java.time.LocalDate;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private LocalDate publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }


    public Book(String title, String dateStr) {
        this.title = title;
        this.publishDate = LocalDate.parse(dateStr); // "2024-01-01" → LocalDate
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {  // List) 제목이랑 출간일이 같으면 같은 책
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {  // Set, Map) 제목이랑 출간일이 같으면 같은 책
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book o) {
        return publishDate.compareTo(o.publishDate) * -1;
    }

    @Override
    public Book clone() {
        Book newBook = new Book(getTitle(), getPublishDate().toString());  // 이게 복사
        return newBook;
    }
}



