package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(String name, int hp, int mp, Wand wand) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
            throw new IllegalArgumentException("HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름은 3글자 이상이어야 함");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard("마법사", 100, 50, new Wand("지팡이", 10));
        wizard.setName("");
        wizard.setName("지팡이");
        wizard.setMp(0);
        wizard.setMp(50);
        wizard.setHp(-5);
        wizard.setHp(100);
        wizard.setWand(null);
        wizard.setWand(new Wand("지팡팡", 50));
    }
}