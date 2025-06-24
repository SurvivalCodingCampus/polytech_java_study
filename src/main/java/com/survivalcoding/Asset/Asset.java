package com.survivalcoding.Asset;

public abstract class Asset {
    private String name;
    private int price;
    private String owner;

    public Asset(String owner, String name, int price) {
        setOwner(owner);
        setName(name);
        setPrice(price);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
}
