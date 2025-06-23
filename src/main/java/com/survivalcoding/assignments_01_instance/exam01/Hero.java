package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Hero {
    static int money = 100; //공공자원
    private int max_hp = 100;
    private String name;
    private int hp;
    private Sword sword;

    public int getHp() {
        return hp;
    }

    public int getMax_hp() {
        return max_hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Hero() {
        this.hp = 100;
        this.name = "김영웅";
    }

    Hero(String name) {
        this.hp = 100;
        this.name = name;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    static void setRandomMoney() {
        money = new Random().nextInt(1000);
    }

    public void run() {
        System.out.println("run");
    }
}
