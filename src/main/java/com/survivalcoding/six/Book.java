package com.survivalcoding.six;

public class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        setIsbn(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null) {
            throw new IllegalArgumentException("isbn은 null일 수 없다.");
        }
        this.isbn = isbn;
    }
}
