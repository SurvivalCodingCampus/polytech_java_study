package com.survivalcoding.six;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, double weight) {
        super(name, price, color, weight);
        setMakerName(color);
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        if (makerName == null) {
            throw new IllegalArgumentException("MakerName은 null일 수 없다.");
        }
        this.makerName = makerName;
    }
}
