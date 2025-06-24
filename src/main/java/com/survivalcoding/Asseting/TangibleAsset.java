package com.survivalcoding.Asseting;

public abstract class TangibleAsset extends Asset implements Thing {
    private int price;
    private String color;
    private double weight;

    TangibleAsset(String name, int price, String color, double weight) {
        super(name);
        setPrice(price);
        setColor(color);
        setweight(weight);
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

    @Override
    public void setweight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getweight() {
        return weight;
    }
}
