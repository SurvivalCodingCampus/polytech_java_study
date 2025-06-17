package com.survivalcoding;

import java.util.Random;

public class Hero {
    // 공유자원
    public static int money = 100;

    private String name;    // null
    private int hp;     // 0
    private Sword sword;    // null

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    private void die() {
        System.out.println("죽었다");
    }

    public void attack(Kinoko enemy) {
        System.out.println("반격을 받았다");
        hp -= 10;
        if (hp < 1) {
            die();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("이름이 너무 긺");
        }
        this.name = name;
    }

    public void run() {
        System.out.println("run");
    }

    public static void setRandomMoney() {
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

        hero1.setHp(-10);

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
