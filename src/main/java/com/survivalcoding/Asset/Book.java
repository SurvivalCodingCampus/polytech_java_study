package com.survivalcoding.Asset;

public class Book extends TangibleAsset {
    String isbn;

    public Book(String name, int price, String color) {
        super(name, price, color);
    }
}
