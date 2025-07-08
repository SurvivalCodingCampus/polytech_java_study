package com.survivalcoding.list;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private Date publishDate;
    private String comment;
    int year;
    int day;
    int month;

    //생성자
    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    //get,set
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

    //3개 까지 숫자로 비교 연이 똑같으면 월이 월이 똑같으면 일로 날짜 비교

    public int compareTo(Book book) {
        if (this.year != book.year && this.day != book.day && this.month != book.month) {
            return -1;
        }
        return 0;
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
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title == book.title && Objects.equals(publishDate, book.publishDate);

        //return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(publishDate);
        return result;
    }
    //return Objects.hash(title, publishDate);

    // 3) 메서드를 제공하고, 깊은 복사를 수행한다.
    @Override
    public Book clone() {
        Book book = (Book) publishDate.clone();
        Book result = new Book(title, publishDate, comment);
        result.title = this.title;
        result.comment = this.comment;
        result.publishDate = (Date) publishDate.clone();
        return result;
    }

}
