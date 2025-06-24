package com.survivalcoding;

public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    TangibleAsset(String name, int price, String color) {
        setName(name);
        setPrice(price);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
