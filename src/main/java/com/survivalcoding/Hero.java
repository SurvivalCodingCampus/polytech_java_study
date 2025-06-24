package com.survivalcoding;


import java.util.Random;

public class Hero {
    // 공유자원
    public static int money = 100;

    private String name;    // null
    private int hp;     // 0
    private Sword sword;    // null

    public void attack(Slime slime) {
        System.out.println(name + "이 공격했다");
        hp -= 10;
    }

    public void run() {
        System.out.println(name + "이 도망쳤다");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0){
            throw new IllegalArgumentException("HP cannot be negative"); // hp는 음수가 될수없음
        }
        this.hp = hp;
    }

    public void attack(Kinoko kinoko) {

    }

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