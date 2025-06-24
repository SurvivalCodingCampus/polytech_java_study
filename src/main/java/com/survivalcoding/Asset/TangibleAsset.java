package com.survivalcoding.Asset;

public abstract class TangibleAsset extends Asset {
    private int price;
    private String color;


    public TangibleAsset(String name) {
        super(name);
    }

    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }
}
