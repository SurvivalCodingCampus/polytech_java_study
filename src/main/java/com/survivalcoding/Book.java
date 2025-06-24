package com.survivalcoding;

public class Book extends TangibleAsset {
    private String isbn;

    Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        setIsbn(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
