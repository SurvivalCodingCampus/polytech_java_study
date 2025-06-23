package com.survivalcoding;

public abstract class Slime {

    private String suffix; // final 을 쓰면 왜 에러남 ?
    private int hp;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }

    //public abstract void Attack(Slime Slime);
}
