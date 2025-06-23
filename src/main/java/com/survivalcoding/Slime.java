package com.survivalcoding;

public class Slime {
    final String suffix;
    int hp;

    //constructor
    public Slime(String suffix, int hp) {
        if (suffix == null) throw new IllegalArgumentException("이름을 정해야 합니다");
        this.suffix = suffix;
        setHp(hp);
    }

    public Slime(String suffix) {
        this(suffix, 8);
    }


    // getter, setter

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void attack(Hero hero) {
        System.out.println("슬라임" + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }
}
