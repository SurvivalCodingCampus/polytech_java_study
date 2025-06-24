package com.survivalcoding.assignments_01_instance.exam01;

public class Computer extends TangibleAsset {
    private String makerName;

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }
}
