package com.survivalcoding.assignments_01_instance.exam02;

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
}

