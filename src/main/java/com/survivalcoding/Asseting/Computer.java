package com.survivalcoding.Asseting;

public class Computer extends TangibleAsset {
    private String makerName;

    Computer(String name, int price, String color, double weight,String makerName) {
        super(name, price, color,weight);
        setMakerName(makerName);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
