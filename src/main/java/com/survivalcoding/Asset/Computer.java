package com.survivalcoding.Asset;

public class Computer extends TangibleAsset {
    private String makeName;

    public Computer(String name, int price, String color, String makerName, double weight) {
        super(name, price, color, weight);
        setMakeName(makeName);
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }
}
