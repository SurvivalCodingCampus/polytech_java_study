package com.survivalcoding.assignments_01_instance.exam01;

public class Wand {
    private String name;
    private double power;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPower(){
        return power;
    }

    public void setPower(double power){

        if(this.power <0.5 || power>100){
            throw new IllegalArgumentException("메세지");
        }

        this.power = power;
    }


}
