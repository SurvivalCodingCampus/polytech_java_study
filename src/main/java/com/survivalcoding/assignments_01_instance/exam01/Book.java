package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.TangibleAsset;

class Book extends TangibleAsset {
    private String isbn;

    public Book(String name, int price, String color, String isbn) {
        super(name, price, color);
        this.isbn = isbn;
    }

}
