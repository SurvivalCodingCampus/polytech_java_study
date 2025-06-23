package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    Wand(String name, double power){
        this.name= name;
        this.power= power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        if(name == null){
            throw new IllegalArgumentException("지팡이의 이름은 null일 수 없습니다.");
        }

        if(name.length()<=3){
            throw new IllegalArgumentException("이름이 너무 짧습니다.");
        }
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;

        if(power<0.5){
            throw new IllegalArgumentException("마력은 0.5이하일 수 없습니다.");
        }

        if(power>100.0){
            throw new IllegalArgumentException("마력은 100.0 이하이어야 합니다.");
        }
    }
}
