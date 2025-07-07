package com.survivalcoding;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private String title;
    private LocalDate publishDate;
    private String comment;

    Book(String title, Date publishDate, String comment) {
        this.title = getTitle();
        this.publishDate = getPublishDate();
        this.comment = getComment();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
