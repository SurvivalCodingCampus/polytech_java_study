package com.survivalcoding.assignments_01_instance.exam01;

//(가): Asset
public class Asset {
    private String name;
    private int price;

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

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
