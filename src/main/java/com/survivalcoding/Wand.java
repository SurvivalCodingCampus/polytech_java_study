package com.survivalcoding;

public class Wand {
    private String name;
    private double power;

    // Constructor
    public Wand(String name, double power) {
        if (name == null) throw new IllegalArgumentException("Wand name cannot be null.");
        if (name.length() < 3) throw new IllegalArgumentException("Length of name must have at least 3 characters");
        if (power < 0.5 || power > 100.0)
            throw new IllegalArgumentException("Wand power must be between 0.5 and 100.0");
        this.name = name;
        this.power = power;
    }

    // getter
    public String getName() {
        return name;
    }

    public double getPower() {
        return power;
    }

    // setter
    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Wand name cannot be null.");
        if (name.length() < 3) throw new IllegalArgumentException("Length of name must have at least 3 characters");
        this.name = name;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100.0)
            throw new IllegalArgumentException("Wand power must be between 0.5 and 100.0");
        this.power = power;
    }
}
