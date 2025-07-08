package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Objects;
import java.util.Random;

public class Hero implements Comparable<Hero>, Cloneable {
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

    public Hero(String name) {
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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "max_hp=" + max_hp +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", sword=" + sword +
                '}';
    }

    @Override
    public int compareTo(Hero o) { // 대소비교 규칙
        return name.compareTo(o.name);
    }

    @Override
    public Hero clone() {
        Hero newHero = new Hero(getName(), getHp());  // 이게 복사
        newHero.setSword((getSword()));
        return newHero;
    }
}
