package com.survivalcoding.Asset;

public class Book extends TangibleAsset {


    private String isbn; // 책 고유 번호

    public Book(String name, int price, String color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


}
