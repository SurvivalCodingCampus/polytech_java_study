package com.survivalcoding.class_3;

public class Book extends TangibleAsset{
    String isbn;

    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public void setWeight(double weight){
        this.weight = weight;
    }
}
