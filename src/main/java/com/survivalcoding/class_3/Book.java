package com.survivalcoding.class_3;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public Book(String name, String color, double weight, String isbn) {
        this(name, DEFAULT_PRICE, color, weight, isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
