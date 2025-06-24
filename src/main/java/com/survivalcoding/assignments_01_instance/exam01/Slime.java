package com.survivalcoding.assignments_01_instance.exam01;

public class Slime {
    public static final int DEFAULT_DAMAGE = 10;

    private final String prefix;
    private int hp;
    private int damage=DEFAULT_DAMAGE;

    public Slime(String prefix, int hp) {
        this.prefix=prefix;
        this.hp=hp;
    }

    public String getPrefix(){
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
    //생성자, getter, setter 작성

    public void attack(Hero hero){
        hero.setHp(hero.getHp() - damage);
    }
}
