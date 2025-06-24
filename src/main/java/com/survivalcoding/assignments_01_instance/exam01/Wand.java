package com.survivalcoding.assignments_01_instance.exam01;

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
        if(name == null)
        {
            throw  new IllegalArgumentException("이름은 null이 아니어야 한다.");
        }
        if(name.length() <= 2)
        {
            throw  new IllegalArgumentException("이름이 너무 짧다.");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if(power < 0.4)
        {
            throw new IllegalArgumentException("마력이 너무 적다.");
        }
        if(power > 100)
        {
            throw new IllegalArgumentException("마력이 너무 크다.");
        }
        this.power = power;
    }

    public void wandTest()
    {
        System.out.println("이름 " + this.name);
        System.out.println(power);
    }


}
