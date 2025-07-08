package com.survivalcoding.asset;

import java.util.Date;
import java.util.Objects;


// 클래스를 생성한 뒤, 생성자 | Getter n' Setter | toString() | equals() | hashCode()
// 를 구성해 '모델 클래스(Model Class)' 를 준비

public class Book extends TangibleAsset implements Comparable<Book>, Cloneable {
    private String isbn;
    private Date publishDate;
    private String comment;

    // Constructor
    public Book(String name, int price, String color, double weight, String isbn, Date publishDate) {
        super(name, price, color, weight);
        setIsbn(isbn);
        setPublishDate(publishDate);
    }

    // getter, setter

    // alternative name caller for Book class
    public String getTitle() {
        return this.getName();
    }

    public void setTitle(String name) {
        setName(name);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null) throw new IllegalArgumentException("ISBN must be set");
        if (!isbn.matches("\\d{10}|\\d{13}")) {
            throw new IllegalArgumentException("ISBN is a numeric code with between 10 and 13 numbers");
        }
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        if (publishDate == null) throw new IllegalArgumentException("Publish date must not be null.");
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Object methods
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book other)) return false; // check if 'Object is a Book'

        return Objects.equals(getTitle(), other.getTitle())
                && getPublishDate().getYear() == other.getPublishDate().getYear()
                && getPublishDate().getMonth() == other.getPublishDate().getMonth()
                && getPublishDate().getDate() == other.getPublishDate().getDate();
    }

    @Override
    public int hashCode() {
        int hashcode = Objects.hashCode(getTitle());

        hashcode += Objects.hashCode(getPublishDate().getYear());
        hashcode += Objects.hashCode(getPublishDate().getMonth());
        hashcode += Objects.hashCode(getPublishDate().getDate());

        hashcode *= 31;
        return hashcode;
    }

    // Collections methods
    @Override
    public int compareTo(Book other) {
        return getPublishDate().compareTo(other.getPublishDate()) * -1;
    }

    @Override
    public Book clone() {
        Book result = new Book(
                getName(),
                getPrice(),
                getColor(),
                getWeight(),
                getIsbn(),
                (Date) getPublishDate().clone() // We all know it came from Date class.
        );
        result.setComment(getComment());
        return result;
    }
}
