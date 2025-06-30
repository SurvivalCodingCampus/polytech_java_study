package com.survivalcoding;

import com.survivalcoding.assignments_01_instance.exam01.Asset;
import com.survivalcoding.assignments_01_instance.exam01.Thing;

public abstract class TangibleAsset extends Asset implements Thing {
    protected String color;
    protected double weight;
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

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
}
