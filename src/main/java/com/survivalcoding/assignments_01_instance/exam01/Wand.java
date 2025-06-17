package com.survivalcoding.assignments_01_instance.exam01;

public class Wand {
    private String name;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("name은 null이 될 수 없음");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }
    //지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
    public void setPower(double power) {
        if(power<0.5f||power>100f){
            throw new IllegalArgumentException("power는 0.5에서 100사이여야 함");
        }
        this.power = power;
    }
}

