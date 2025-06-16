package com.survivalcoding;


import java.util.Random;

public class Hero {
    // 공유자원
    static int money = 100;

    String name;    // null
    int hp;     // 0
    Sword sword;    // null

    static void setRandomMoney() {
        Hero.money = new Random().nextInt(1000);

        Hero hero = new Hero("aaa", 10);
        hero.name = "홍길동";
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        int a = 10;

        Hero.money = 500;

        Hero hero1 = new Hero("홍길동", 100);
        System.out.println(Hero.money);


        Hero hero2 = hero1;
        hero2.hp = 200;
        System.out.println(hero1.hp);

        Sword sword1 = new Sword();
        sword1.damage = 100;

        hero1.sword = sword1;

        hero1 = null;
//        String name = new String("오준석");

        System.out.println(hero2.hp);
    }
}