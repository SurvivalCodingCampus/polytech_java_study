package com.survivalcoding.six;

public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
