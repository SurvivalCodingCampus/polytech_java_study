package com.survivalcoding;

public abstract class TangibleAsset extends IntangibleAsset {
    private int price;
    private String color;

    TangibleAsset(String patent, String name, int price, String color) {
        super(patent, name);
        setPrice(price);
        setColor(color);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
