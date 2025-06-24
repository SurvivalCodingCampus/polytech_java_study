package com.survivalcoding.assignments_01_instance.exam01;
//연습3에서 4 모두 작성
public class TangibleAsset extends Asset implements Thing {

    private String color;
    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
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
