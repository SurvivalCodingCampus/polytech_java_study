package com.survivalcoding.Asset;

public class Book extends TangibleAsset {
    private int isbn;

    public Book(String name, int price, String color, double weight, int isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
