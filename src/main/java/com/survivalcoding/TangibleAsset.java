package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private int price;
    private String color;
    private double weight;

    protected TangibleAsset(String name, int price, String color, double weight) {
        super(name);
        setPrice(price);
        setColor(color);
        setWeight(weight);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative number");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) throw new IllegalArgumentException("Color must be set");
        this.color = color;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        if (weight <= 0) throw new IllegalArgumentException("Cannot get zero or negative weight.");
        this.weight = weight;
    }
}
