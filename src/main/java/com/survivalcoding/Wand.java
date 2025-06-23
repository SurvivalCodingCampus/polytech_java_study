package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    public Wand(String name)
    {
        this(name, 10.0);
    }

    public Wand(String name, double power)
    {
        setName(name);
        this.power = power;
    }

    public double getPower()
    {
        return power;
    }
    public void setPower(double power)
    {
        this.power = power;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
