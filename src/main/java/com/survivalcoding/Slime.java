package com.survivalcoding;

public class Slime {
    final String suffix;
    private int hp;

    public Slime(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null 입니다");
        }
        this.suffix = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            return;
        }

        this.hp = hp;

    }

    public void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }
}
