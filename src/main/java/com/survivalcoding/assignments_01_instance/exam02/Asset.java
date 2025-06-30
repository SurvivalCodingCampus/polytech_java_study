package com.survivalcoding.assignments_01_instance.exam02;

public abstract class Asset {
    private final String name;
    private long price;

    public Asset(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void changePrice(long price) {
        this.price = price;
    }
}
