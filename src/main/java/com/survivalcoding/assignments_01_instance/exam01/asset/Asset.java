package com.survivalcoding.assignments_01_instance.exam01.asset;

public abstract class Asset {
    final private String name;
    private int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
