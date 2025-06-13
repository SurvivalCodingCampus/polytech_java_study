package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    public String name = "Cleric";

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public int HP = MAX_HP;
    public int MP = MAX_MP;

    public void selfAid()
    {
        MP -=5;
        HP = MAX_HP;
    }

    }


