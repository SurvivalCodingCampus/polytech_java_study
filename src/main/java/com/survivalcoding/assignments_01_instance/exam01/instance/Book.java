package com.survivalcoding.assignments_01_instance.exam01.instance;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book(String title, String dateStr) {
        this.title = title;
        this.publishDate = LocalDate.parse(dateStr); // "2024-01-01" → LocalDate
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


}



