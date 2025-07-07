package com.survivalcoding.assignments_01_instance.exam01.instance;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, Date publishDate) {
        this.title = title;
        this.publishDate = publishDate;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(this.publishDate);
        c2.setTime(book.publishDate);

        return Objects.equals(title, book.title) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)
                && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH)
                && c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int hashCode() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(publishDate);
        return Objects.hash(title,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public int compareTo(Book o) {

        return publishDate.compareTo(o.publishDate) * -1;
    }

    @Override
    public Book clone() {
        Book newBook = new Book(title);
        newBook.publishDate = (Date) this.publishDate.clone();

        return newBook;
    }
}



