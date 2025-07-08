package com.survivalcoding.instance;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<LocalDate>, Cloneable {
    private String title;
    private LocalDate publishDate;
    private String comment;

    public Book(String title) {
        setTitle(title);
        publishDate = LocalDate.now();
    }

    public Book(String title, int year, int month, int day) {
        setTitle(title);
        setPublishDate(year, month, day);
    }

    public Book(String title, int year, int month, int day, String comment) {
        this(title, year, month, day);
        setComment(comment);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book cloned = (Book) super.clone();

        int year = publishDate.getYear();
        int month = publishDate.getMonthValue();
        int day = publishDate.getDayOfMonth();

        cloned.setPublishDate(year, month, day);

        return cloned;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    // 내림차순
    @Override
    public int compareTo(LocalDate o) {
        if (publishDate.isBefore(o)) {
            return 1;
        }
        if (publishDate.isAfter(o)) {
            return -1;
        }
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate.toString();
    }

    public void setPublishDate(int year, int month, int day) {
        publishDate = LocalDate.of(year, month, day);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
