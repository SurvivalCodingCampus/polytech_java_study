package com.survivalcoding.assignments_01_instance.exam01;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }

        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 한다.");
        }
        this.power = power;
    }

    public Wand(String name, double power) {
        this.name = name;
        this.power = power;
    }

    public static void main(String[] args) {
        Wand wand = new Wand("지팡이", 10);
        wand.setName("");
        wand.setPower(105);
    }
}
