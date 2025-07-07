package com.survivalcoding;


import java.util.Objects;
import java.util.Random;

public class Hero implements Comparable<Hero>, Cloneable {
    // 공유자원
    public static int money = 100;

    public static void setRandomMoney() {
        Hero.money = new Random().nextInt(1000);

        Hero hero = new Hero("aaa", 10);
        hero.name = "홍길동";
    }

    private String name;    // null
    private int hp;     // 0
    private Sword sword;    // null

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public void attack(Kinoko kinoko) {
        System.out.println("attack");
    }

    public void run() {
        System.out.println("run");
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Hero hero)) return false;

        return hp == hero.hp && Objects.equals(name, hero.name) && Objects.equals(sword, hero.sword);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + hp;
        result = 31 * result + Objects.hashCode(sword);
        return result;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", sword=" + sword +
                '}';
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

    @Override
    public int compareTo(Hero o) {
        return Integer.compare(hp, o.hp) * -1;
    }

    @Override
    public Hero clone() {
        Hero newHero = new Hero(getName(), getHp());
        newHero.setSword(getSword());
        return newHero;
    }
}
