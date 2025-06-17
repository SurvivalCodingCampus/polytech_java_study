package com.survivalcoding.assignments_01_instance.exam01;

public class Wand {

    private String name;
    private double power;

    Wand(String name, double power) {
        this.power = power;
        this.name = name;
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

    public void wandTest()
    {
        System.out.println("이름 " + this.name);
        System.out.println(power);
    }


}
