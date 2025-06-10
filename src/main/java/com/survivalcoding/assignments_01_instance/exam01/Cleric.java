package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    private String name;
    private int hp;
    private int mp;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    public Cleric(String name) {
        hp = MAX_HP;
        mp = MAX_MP;
        this.name = name;
    }
}
