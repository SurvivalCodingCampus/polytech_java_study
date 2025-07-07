package com.survivalcoding.Book;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book() {
    }

    public Book(String title, Date publishDate, String comment) {
        setTitle(title);
        setPublishDate(publishDate);
        setComment(comment);
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
    public final boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return title.equals(book.title) && publishDate.equals(book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public Book clone() {
        Book copy = new Book(this.title, this.publishDate, this.comment);

        return copy;
    }

    @Override
    public String toString() {
        return ("Title : " + title + " 출판일 : " + publishDate + " 주석 : " + comment);
    }
}
