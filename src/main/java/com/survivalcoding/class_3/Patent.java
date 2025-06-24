package com.survivalcoding.class_3;

public class Patent extends IntangibleAsset {
    public Patent(String name, int price) {
        super(name, price);
    }

    public Patent(String name) {
        super(name, DEFAULT_PRICE);
    }
}
