package com.survivalcoding.six;

public abstract class TangibleAsset extends Asset implements Thing {
    private String color;
    private double weight;

    public TangibleAsset(String name, int price, String color, double weight) {
        super(name, price);
        setColor(color);
        setWeight(weight);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("color는 null일 수 없다.");
        }
        this.color = color;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("무게는 음수일 수 없다.");
        }
        this.weight = weight;
    }

}
