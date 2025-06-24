package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.TangibleAsset;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }
}
