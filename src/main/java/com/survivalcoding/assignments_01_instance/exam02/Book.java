package com.survivalcoding.assignments_01_instance.exam02;

import java.awt.*;

public class Book extends TangibleAsset {
    private final String isbn;

    public Book(String name, long price, Color color, double weight, String isbn) {
        super(name, price, color, weight);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
