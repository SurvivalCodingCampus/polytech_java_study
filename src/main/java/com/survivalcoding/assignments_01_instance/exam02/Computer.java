package com.survivalcoding.assignments_01_instance.exam02;

import java.awt.*;

public class Computer extends TangibleAsset {
    private final String makerName;

    public Computer(String name, long price, Color color, double weight, String makerName) {
        super(name, price, color, weight);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return makerName;
    }
}
