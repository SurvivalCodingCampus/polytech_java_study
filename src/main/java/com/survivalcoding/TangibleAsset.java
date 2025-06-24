package com.survivalcoding;

public abstract class TangibleAsset extends Asset implements Thing {
    private int price;
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name);
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    // Thing 인터페이스 구현
    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}