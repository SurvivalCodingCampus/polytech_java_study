package com.survivalcoding.game;

public class Hero {
    private String name;
    private int hp;
    private int maxHp = 50;

    // constructor

    // Placeholder, should modify it later
    public Hero(String name) {
        this(name, 50);
    }

    public Hero(String name, int hp) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        this.name = name;

        if (hp < 0) System.out.println("hp is set to 0 because you were trying to set it less than 0");
        setHp(hp);
    }

    // getter
    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    // setter
    public void setHp(int hp) {
        if (hp < 0) System.out.println("hp is set to 0 because you were trying to set it less than 0");
//        this.hp = Math.max(hp, 0);
        this.hp = Math.clamp(hp, 0, maxHp);
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        this.name = name;
    }
}
