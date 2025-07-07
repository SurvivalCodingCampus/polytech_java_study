package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Date;

public class Book2 implements Comparable<Book2> {
    private String title;
    private Date publishDate;
    private String comment;

    public Book2(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book2 other = (Book2) obj;
        return this.title.equals(other.title) && this.publishDate.equals(other.publishDate);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + publishDate.hashCode();
    }

    @Override
    public int compareTo(Book2 other) {
        return this.publishDate.compareTo(other.publishDate);
    }

    public Book2 clone() {
        return new Book2(
                this.title, (Date) this.publishDate.clone(), this.comment
        );

    }
}



