package com.survivalcoding;

public class Slime {
    private final String suffix;
    public static final int Default_Damage = 10;
    private int hp;

    private int damage = Default_Damage;

    public Slime(String suffix, int hp) {
        this.suffix = suffix;
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack(Hero hero)
    {
        System.out.println("슬라임" + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - damage);
    }
}
