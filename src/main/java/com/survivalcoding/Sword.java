package com.survivalcoding;

public class Sword implements Cloneable {
    public String name;
    public int damage;

    public Sword() {
        this("기본 이름");
    }

    public Sword(String name) {
        this.name = name;
        damage = 10;
    }

    public static void main(String[] args) {
        Sword sword = new Sword("엑스칼리버");
        Sword sword2 = new Sword();

        System.out.println(sword.name);
        System.out.println(sword.damage);
    }
}
