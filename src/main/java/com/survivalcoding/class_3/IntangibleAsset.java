package com.survivalcoding.class_3;

public abstract class IntangibleAsset extends Asset {
    public IntangibleAsset(String name, int price) {
        super(name, price);
    }

    public IntangibleAsset(String name) {
        this(name, DEFAULT_PRICE);
    }
}

