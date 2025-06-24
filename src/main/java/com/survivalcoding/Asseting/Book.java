package com.survivalcoding.Asseting;

public class Book extends TangibleAsset {
    private String isbn;

    Book(String name, int price, String color, double weight,String isbn) {
        super(name, price, color, weight);
        setIsbn(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
