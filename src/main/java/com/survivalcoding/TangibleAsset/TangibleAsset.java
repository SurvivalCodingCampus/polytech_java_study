package com.survivalcoding.TangibleAsset;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

}