package com.survivalcoding.assignments_01_instance.exam01;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    public void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("name cannot be null");
        }
        if(name.trim().length() < 3){
            throw new IllegalArgumentException("name length cannot be less than 3");
        }

        this.name = name;
    }

    public void setPower(double power) {

        if(power < 0.5f || power > 100.f){
            throw new IllegalArgumentException("power cannot be less than 100");
        }

        this.power = power;
    }
}
