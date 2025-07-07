package com.survivalcoding.nine;

import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String title;
    private LocalDate publishDate;
    private String comment;


    public Book(String title, LocalDate publishDate, String comment) {
        setTitle(title);
        setPublishDate(publishDate);
        setComment(comment);
    }

    //제목과 출간일(예: 2024-01–01)이 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return this.title.equals(book.title) && this.publishDate.equals(book.publishDate);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + publishDate.hashCode();
        return result;
    }

    //Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다.
    @Override
    public int compareTo(Book book) {
        return book.publishDate.compareTo(this.publishDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", comment='" + comment + '\'' +
                '}';
    }


    //clone() 메서드를 제공하고, 깊은 복사를 수행한다.
    public Book clone() {
        Book book = new Book(this.title, this.publishDate, this.comment);
        return book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("타이틀은 null이면 안됩니다.");
        }
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("날짜는 null이면 안됩니다.");
        }
        // 새 Date 객체를 만들어서 시간은 0으로 세팅
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        if (comment == null) {
            throw new IllegalArgumentException("코멘트는 null이면 안됩니다.");
        }
        this.comment = comment;
    }
}
