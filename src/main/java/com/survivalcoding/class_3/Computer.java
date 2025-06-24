package com.survivalcoding.class_3;

public class Computer extends TangibleAsset{
    String makerName;

    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public void setWeight(double weight){
        this.weight = weight;
    }
}
