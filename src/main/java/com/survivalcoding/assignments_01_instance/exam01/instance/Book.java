package com.survivalcoding.assignments_01_instance.exam01.instance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("AA", "2024-06-08"));
        books.add(new Book("BB", "2025-07-07"));
        books.add(new Book("CC", "2024-12-25"));

        Collections.sort(books);

        System.out.println(books);

    }
}



