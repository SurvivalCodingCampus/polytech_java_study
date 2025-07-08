package com.survivalcoding.Book;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
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
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        if (!title.equals(book.title)) return false;

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(this.publishDate);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(book.publishDate);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int hashCode() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(publishDate);
        int dateHash = Objects.hash(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        return Objects.hash(title, dateHash);
        // return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book other) {
        return other.publishDate.compareTo(this.publishDate);
    }

    @Override
    public Book clone() {
        Book copy = new Book(this.title, new Date(publishDate.getTime()), this.comment);
        return copy;
    }

    @Override
    public String toString() {
        return ("Title : " + title + " 출판일 : " + publishDate + " 주석 : " + comment);
    }
}
