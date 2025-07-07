package com.survivalcoding;

public class Wand {
    private String name;    // null
    private double power;   // 0.0

    public Wand(String name) {
        this(name, 10.0);
    }

    public Wand(String name, double power) {
        setName(name);
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이의 이름은 null 일 수 없다");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("지팡이의 이름은 3문자 이상이어야 한다");
        }

        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        // 0.5 이상 100.0 이하
        if (!(0.5 <= power && power <= 100.0)) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 함");
        }
        this.power = power;
    }
}