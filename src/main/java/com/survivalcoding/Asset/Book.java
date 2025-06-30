package com.survivalcoding.Asset;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String owner, String name, int price, String color, String isbn, double weight) {
        super(owner, name, price, color, weight);
        setIsbn(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
