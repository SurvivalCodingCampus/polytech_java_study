package com.survivalcoding.class_3;

public class Slime {
    // final : 생성자로 생성 후 수정하지 않겠다 선언
    private final String suffix;
    private int hp;

    // 생성자, getter, setter 작성
    Slime(String suffix, int hp) {
        this.suffix = suffix;
        this.hp = hp;
    }

    Slime(String suffix) {
        this(suffix, 10);
    }

    public void attack(Hero hero) {
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }

    //getter
    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    //setter
    public void setHp(int hp) {
        this.hp = hp;
    }
}
