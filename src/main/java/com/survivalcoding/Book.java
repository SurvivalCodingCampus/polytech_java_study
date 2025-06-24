package com.survivalcoding;

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
        if (isbn == null) throw new IllegalArgumentException("ISBN must be set");
        if (!isbn.matches("\\d{10}|\\d{13}")) {
            throw new IllegalArgumentException("ISBN is a numeric code with between 10 and 13 numbers");
        }
        this.isbn = isbn;
    }
}
