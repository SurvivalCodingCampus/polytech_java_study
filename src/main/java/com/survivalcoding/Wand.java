package com.survivalcoding;

public class Wand {

    private String name;
    private double power;

    Wand(String name, double power) {
        setName(name);
        setPower(power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("해당 이름(지팡이)에 NULL을 집어넣었습니다");
        }
        if (3 > name.length()) {
            throw new IllegalArgumentException("이름(지팡이)은 최소 3글자 이상이어야 합니다.");
        }

        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power <= 0.5 || power >= 100.0) {
            throw new IllegalArgumentException("지팡이의 power은 0.5이상 100.0 이하여만 합니다");
        }
        this.power = power;
    }

}
