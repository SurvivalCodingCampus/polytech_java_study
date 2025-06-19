package com.survivalcoding;

public class Wizard {

    private int hp;
    private int mp;
    private String name;
    Wand wand;

    void heal(Hero hero) {
        int basePoint = 10;         // 기본회복 포인트
        int recovPoint = (int) (basePoint * this.wand.getPower());   // 지팡이에 의한 증폭
        hero.setHp (hero.getHp() + recovPoint);                  // 용사의 HP를 회복
    }

    public String getName () {

        return name;
    }

    public void setName (String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        this.name = name;
    }

    public int getHP () {

        return hp;
    }

    public void setHP (int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public int getMP () {
        return mp;
    }

    public void setMP (int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MP는 0이상 이어야 한다.");
        }
        this.mp = mp;
    }

    public Wand getWand () {
        return wand;
    }

    public void setWand (Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("지팡이는 null일 수 없습니다.");
        }
        this.wand = wand;
    }
}
