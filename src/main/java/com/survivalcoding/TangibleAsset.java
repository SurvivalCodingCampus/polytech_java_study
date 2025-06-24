package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    int price;
    String color;

    double weight;

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
