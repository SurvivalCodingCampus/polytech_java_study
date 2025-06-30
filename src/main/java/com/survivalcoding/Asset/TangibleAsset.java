package com.survivalcoding.Asset;

public abstract class TangibleAsset extends Asset implements Thing {//추상클래스


    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

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
