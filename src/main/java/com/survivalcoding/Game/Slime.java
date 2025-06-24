package com.survivalcoding.Game;

public class Slime {
    private String name;
    private int hp;

    Slime(String name) {
        setName(name);
        setHp(50);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Hero hero) {
        System.out.println("슬라임" + name + "이/가 공격했다");
        System.out.println("10의 대미지");

        hero.setHp(hero.getHp() - 10);
    }
}
