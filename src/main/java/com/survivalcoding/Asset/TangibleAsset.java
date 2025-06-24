package com.survivalcoding.Asset;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;

    public TangibleAsset(String owner, String name, int price, String color, double weight) {
        super(owner, name, price);
        setColor(color);
        setWeight(weight);
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
