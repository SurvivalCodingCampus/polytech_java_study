package com.survivalcoding.six;

public abstract class Asset {
    private String name;
    private int price;

    public Asset(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Asset name 은 null일 수 없다.");
        }
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Asset price은 0원 이상이여야 한다.");
        }
        this.price = price;
    }
}
