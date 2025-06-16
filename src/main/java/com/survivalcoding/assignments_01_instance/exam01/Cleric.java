package com.survivalcoding.assignments_01_instance.exam01;

import java.sql.SQLOutput;

public class Cleric {

    public String name = "Cleric";
    public int hp;
    public int mp;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;


    public Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    public Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }

    public static void main(String[] args) {
        Cleric a = new Cleric("아서스", 40, 5);
        Cleric b = new Cleric("아서스", 35);
        Cleric c = new Cleric("아서스"); // 골라쓰기

    }
}






