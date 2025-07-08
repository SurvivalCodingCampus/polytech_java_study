package com.survivalcoding;


import java.util.Random;

public class Hero {
    // 공유자원
    static int money = 100;
    static int initialHP;
    final static int MAX_HP = 200;
    private String name;    // null
    private int hp;     // 0
    private Sword sword;    // null

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Hero.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp가 0 미만");
        }
        if (hp > MAX_HP) {
            throw new IllegalArgumentException("최대 HP를 넘을 수 없음");
        }
        this.hp = hp;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    static void setRandomMoney() {
        Hero.money = new Random().nextInt(1000);

        Hero hero = new Hero("aaa", 10);
        hero.name = "홍길동";
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        initialHP = this.hp;
    }

    public void run() {
        System.out.println("Run\n");
    }

    public void attack(Kinoko kinoko) {
        System.out.println("때린다다다\n");
    }
}