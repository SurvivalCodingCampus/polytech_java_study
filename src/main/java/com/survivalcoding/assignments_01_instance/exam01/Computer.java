package com.survivalcoding.assignments_01_instance.exam01;

public class Computer extends TangibleAsset {

    public Computer(String name, int price, String color, double weight){
        super(name, price, color, weight);
    }
    private String makerName;

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
