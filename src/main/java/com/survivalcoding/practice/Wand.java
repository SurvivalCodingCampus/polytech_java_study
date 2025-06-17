package com.survivalcoding.practice;

public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power) {
        // 유효성 검사
        if (name == null) {
            throw new IllegalArgumentException("지팡이 이름은 반드시 입력해 주세요");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("지팡이 이름은 3글자 이상이어야 합니다");
        }
        if (power < 0.5) {
            throw new IllegalArgumentException("지팡이 파워는 0.5 이상이어야 합니다");
        }
        if (100 < power) {
            throw new IllegalArgumentException("지팡이 파워는 100 이하여야 합니다");
        }

        // 대입
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

    public void setPower(double power) {
        this.power = power;
    }
}
