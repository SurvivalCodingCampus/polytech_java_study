package com.survivalcoding;

public class Slime {
    protected final String suffix;

    public Slime(String suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이 공격했다!");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }
}
