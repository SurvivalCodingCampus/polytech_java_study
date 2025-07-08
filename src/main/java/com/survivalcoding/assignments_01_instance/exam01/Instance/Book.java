package com.survivalcoding.assignments_01_instance.exam01.Instance;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;


    // 제목과 출간일이(예: 2024-01-01) 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
public Book(String title, Date publishDate, String comment){
    this.title=title;
    this.publishDate=publishDate;
    this.comment=comment;
}

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getTitle(), book.getTitle())
                && getPublishDate().getYear()==book.getPublishDate().getYear()
                && getPublishDate().getMonth()==book.getPublishDate().getMonth()
                && getPublishDate().getDate()==book.getPublishDate().getDate();
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result=31*result+getPublishDate().getYear();
        result=31*result+getPublishDate().getMonth();
        result=31*result+getPublishDate().getDate();

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

    // Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다
    @Override
    public int compareTo(Book book) {
        return -1*publishDate.compareTo(book.getPublishDate());
    }

    @Override
    public Book clone(){
        Date date=(Date) publishDate.clone();
        return new Book(title, date, comment);
    }

}

//clone() 메서드를 제공하고, 깊은 복사를 수행한다
