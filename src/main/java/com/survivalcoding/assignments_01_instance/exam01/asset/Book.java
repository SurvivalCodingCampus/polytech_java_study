package com.survivalcoding.assignments_01_instance.exam01.asset;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
