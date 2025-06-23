package com.survivalcoding;

public class Wand {
    private String name;    // 지팡이의 이름
    private double power;   // 지팡이의 마력

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("지팡이 이름은 null일 수 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public double getPower() {

        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0) {
            throw new IllegalArgumentException("0.5 이상 100.0이하 이여야 한다.");
        }

        this.power = power;
    }
}
