package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard("마법사", 100, 50);
        wizard.setName("");
    }
}