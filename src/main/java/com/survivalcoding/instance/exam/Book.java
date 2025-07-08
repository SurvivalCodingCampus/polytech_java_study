package com.survivalcoding.instance.exam;

import java.util.Date;
import java.util.Objects;

// 모델 클래스
public class Book implements Comparable<Book> {
    // String, primitive type = 값을 복사 느낌 (깊은 복사)
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
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
    public final boolean equals(Object other) {
        if (!(other instanceof Book book)) return false;

        return Objects.equals(getTitle(), book.getTitle())
                && getPublishDate().getYear() == book.getPublishDate().getYear()
                && getPublishDate().getMonth() == book.getPublishDate().getMonth()
                && getPublishDate().getDate() == book.getPublishDate().getDate();
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + getPublishDate().getYear();
        result = 31 * result + getPublishDate().getMonth();
        result = 31 * result + getPublishDate().getDate();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        return -1 * publishDate.compareTo(other.getPublishDate());
    }
}
