package com.survivalcoding.assignments_01_instance.exam01;

public abstract class TangibleAsset extends Asset {


    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }


    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
