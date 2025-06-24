package com.survivalcoding;

public class Slime {
    protected final String suffix;
    private int hp;

    public Slime(String suffix) {
        this.suffix = suffix;
        this.hp = 100;
    }

    public void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이 공격했다!");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp() - 10);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0); // 음수 방지
    }
}

