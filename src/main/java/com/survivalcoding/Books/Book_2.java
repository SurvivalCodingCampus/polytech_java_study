package com.survivalcoding.Books;

import java.util.Date;
import java.util.Objects;

public class Book_2 implements Comparable<Book_2>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;
    private int number;

    public Book_2(String title, String comment){

        setPublishDate(new Date());
        setTitle(title);
        setComment(comment);
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date date) {
        this.publishDate = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public Book_2 clone() {
        Book_2 result = new Book_2(this.title, this.comment);
        result.setPublishDate((Date) getPublishDate().clone());
        return result;
    }

    @Override
    public int compareTo(Book_2 o) {

        return 0;
    }
}
