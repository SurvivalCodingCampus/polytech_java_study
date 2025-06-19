package com.survivalcoding;

public class Wizard extends Character {
    private String name;
    private int hp;
    private int mp;
    private Wand wand;

    public Wizard(String name) {
        this(name, null);
    }

    public Wizard(String name, Wand wand) {
        this.name = name;
        this.wand = wand;
        this.hp = 100;
        this.mp = 50;
    }

    public Wizard(String name, int hp, int mp, Wand wand) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.wand = wand;
    }

    public void fireball(Slime slime) {

    }

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

    @Override
    public void attack(Slime slime) {

    }

    public static void main(String[] args) {
        Character wizard = new Wizard("aaa");
        Slime slime = new Slime("bbb", 10);

        wizard.attack(slime);
//        wizard.fireball(slime);
    }
}
