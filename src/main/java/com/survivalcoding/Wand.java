package com.survivalcoding;

public class Wand {
    private String name; // 지팡이이름
    private double power;  // 지팡이마력

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("지팡이 이름은 null이 안됨");

        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power > 0.5 && power < 100.0)
            throw new IllegalArgumentException("power의 값이 벗어남");

        this.power = power;
    }
}
