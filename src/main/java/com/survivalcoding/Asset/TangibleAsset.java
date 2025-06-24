package com.survivalcoding.Asset;

public abstract class TangibleAsset extends Asset implements Thing {
    private String name;
    private int price;
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        setName(name);
        setPrice(price);
        setColor(color);
        setWeight(weight);
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

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
