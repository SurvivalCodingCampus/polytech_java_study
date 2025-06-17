package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    // 생성자 만들기
    Wand(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    //2번------------
    public void setPower(double power) {
        if (power < 0.5) {
            throw new IllegalArgumentException("0.5이하면 안됨");
        }
        if (power > 100) {
            throw new IllegalArgumentException("100.0 이상 안됨");
        }
        this.power = power;
    }

}
