package com.survivalcoding.assignments_01_instance.exam01;

public abstract class TangibleAsset extends Asset implements Thing {

    private double weight;
    private String color;

    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

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
}
