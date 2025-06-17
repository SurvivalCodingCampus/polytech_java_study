package com.survivalcoding;

public class Hero {
    private String name;
    private int hp;

    // constructor

    // Placeholder, should modify it later
    public Hero(String name) {
        this(name, 50);
    }

    public Hero(String name, int hp) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        this.name = name;
        this.hp = hp;
    }

    // getter
    public int getHP() {
        return hp;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setHP(int hp) {
        if (hp < 0) System.out.println("hp is set to 0 because you were trying to set it less than 0");
        this.hp = Math.min(hp, 0);
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        this.name = name;
    }
}
