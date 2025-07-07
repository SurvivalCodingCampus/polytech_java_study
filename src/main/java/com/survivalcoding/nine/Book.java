package com.survivalcoding.nine;

import java.util.Date;

public class Book {
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("타이틀은 null이면 안됩니다.");
        }

        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        if (publishDate == null) {
            throw new IllegalArgumentException("날짜는 null이면 안됩니다.");
        }
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
