package com.survivalcoding.reading;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>
{
    private String title;
    private Date publishDate;
    private String comment;

    public Book book;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    private static Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getTime();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book other) {
        return this.publishDate.compareTo(other.publishDate);
    }

    @Override
    public Book clone() {
        Date date = createDate(2024, 1, 1);
        Book result = new Book("Java Basics", date, "First edition");
        result.title = this.title;
        result.comment = this.comment;
        result.publishDate = this.publishDate;
        result.book = this.book.clone();
        return result;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', publishDate=" + publishDate + ", comment='" + comment + "'}";
    }
}
