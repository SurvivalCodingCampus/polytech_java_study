package com.survivalcoding;

public class Book1 extends TangibleAsset {
    private String isbn;

    public Book1(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
