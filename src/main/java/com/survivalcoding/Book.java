package com.survivalcoding;

public class Book extends TangibleAsset {
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null) throw new IllegalArgumentException("ISBN must be set");
        this.isbn = isbn;
    }
}
