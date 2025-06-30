package com.survivalcoding.assignments_01_instance.exam02;

import java.awt.*;

public abstract class TangibleAsset extends Asset implements Thing {
    private final Color color;
    private double weight;

    public TangibleAsset(String name, long price, Color color, double weight) {
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

    public Color getColor() {
        return color;
    }
}

