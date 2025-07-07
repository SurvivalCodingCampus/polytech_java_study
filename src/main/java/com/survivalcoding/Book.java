package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = new Date(publishDate.getTime());
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book other = (Book) o;
        return Objects.equals(this.title, other.title) &&
                Objects.equals(this.publishDate, other.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book other) {
        return other.publishDate.compareTo(this.publishDate);
    }

    @Override
    public Book clone() {
        try {
            Book copy = (Book) super.clone();
            copy.publishDate = new Date(this.publishDate.getTime());
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
