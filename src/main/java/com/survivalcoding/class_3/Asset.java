package com.survivalcoding.class_3;

public abstract class Asset {
    public static int DEFAULT_PRICE = 10000;
    private String name;
    private int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Asset(String name) {
        this(name, DEFAULT_PRICE);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
