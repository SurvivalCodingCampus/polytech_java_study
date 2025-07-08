package com.survivalcoding.assignments_01_instance.exam01;

public class Sword {
    public String name;
    public int damage;

    void attack() {
        System.out.println(this.name + "는 공격당했다 !");
        System.out.println("적에게 5포인트의 데미지를 주었다 !");
    }

    public Sword(String name) {
        this.name = name;
        damage = 10;
    }

    public static void main(String[] args) {
        Sword sword = new Sword("sk");


    }

}
