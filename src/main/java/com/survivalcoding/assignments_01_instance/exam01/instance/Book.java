package com.survivalcoding.assignments_01_instance.exam01.instance;

import java.time.LocalDateTime;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private LocalDateTime publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public Book(String title, LocalDateTime publishDate) {
        this.title = title;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(publishDate.toLocalDate(), book.publishDate.toLocalDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate.toLocalDate());
    }

    @Override
    public int compareTo(Book o) {
        return publishDate.compareTo(o.publishDate) * -1;
    }

    @Override
    public Book clone() {
        Book newBook = new Book(getTitle(), getPublishDate());  // 이게 복사
        return newBook;
    }
}



