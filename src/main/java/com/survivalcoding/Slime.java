package com.survivalcoding;

import Monster.Monster;

public abstract class Slime extends Monster {
    public static final int DEFAULT_DAMAGE = 10;

    private final String prefix;
    private int hp;
    private int damage = DEFAULT_DAMAGE;

    public Slime(String prefix, int hp) {
        this.prefix = prefix;
        this.hp = hp;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Hero hero) {
        hero.setHp(hero.getHp() - damage);
    }

    @Override
    public void run() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Slime slime = new Slime("", 10);
        Monster monster = new Slime("", 10);
        slime.run();
        monster.run();

        // Slime slime1 = (Hero) monster;

        float ff = 10f;
        int dd = 10;

        // ff = dd;

        // dd = (int) ff;
    }
}
