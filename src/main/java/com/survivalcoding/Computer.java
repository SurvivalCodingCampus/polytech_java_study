package com.survivalcoding;

public class Computer extends TangibleAsset {
    private String makerName;

    Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        setMakerName(makerName);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
