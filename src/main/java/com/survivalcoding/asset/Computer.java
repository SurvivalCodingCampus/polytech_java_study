package com.survivalcoding.asset;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, double weight, String makerName) {
        super(name, price, color, weight);
        setMakerName(makerName);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        if (makerName == null) throw new IllegalArgumentException("Maker name must be set. Check the computer's tag");
        this.makerName = makerName;
    }
}
