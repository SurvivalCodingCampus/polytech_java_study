package com.survivalcoding.assignments_01_instance.exam01;

import java.util.Random;

public class Hero {
    public static int money=100;

    private String name;
    private int hp;
    private int maxHp;
    private Sword sword;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp<0){
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public void attack(Kinoko kinoko){

    }

    static void setRandomMoney(){
        Hero.money=new Random().nextInt(1000);
        Hero hero=new Hero("aaa",10);
        hero.name="홍길동";
    }

    public Hero(String name, int hp){
        this.name=name;
        this.hp=hp;
        this.maxHp=hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public static void main(String[] args){
        int a=10;

        Hero.money=500;

        Hero hero1 = new Hero("홍길동",100);
        System.out.println(hero1.money);

        hero1.setHp(-10);

        Hero hero2 = hero1;
        hero2.hp=200;
        System.out.println(hero1.hp);

        Sword sword1=new Sword();
        sword1.name=" ";
        sword1.damage=100;

        hero1.sword=sword1;

        hero1=null;

        System.out.println(hero2.hp);
    }
}
