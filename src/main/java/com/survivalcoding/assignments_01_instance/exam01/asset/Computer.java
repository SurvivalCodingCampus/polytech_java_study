package com.survivalcoding.assignments_01_instance.exam01.asset;

public class Computer extends TangibleAsset {
    private String markerName;

    public Computer(String name, int price, String color, double weight, String markerName) {
        super(name, price, color, weight);
        this.markerName = markerName;
    }

    public String getMarkerName() {
        return markerName;
    }

    public static void main(String[] args) {
        
    }

}
