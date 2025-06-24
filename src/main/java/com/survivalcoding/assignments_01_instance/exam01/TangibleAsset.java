package com.survivalcoding.assignments_01_instance.exam01;

public class TangibleAsset extends Asset {

    private String color;

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
}
