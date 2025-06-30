package com.survivalcoding.class_3;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, double weight, String makerName) {
        super(name, price, color, weight);
        this.makerName = makerName;
    }

    public Computer(String name, String color, double weight, String makerName) {
        this(name, DEFAULT_PRICE, color, weight, makerName);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

}
