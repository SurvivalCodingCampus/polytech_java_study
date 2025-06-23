package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    public Wizard(String name, int hp, Wand wand) {
        this.name = name;
        this.hp = hp;
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;

        if (hp < 0) {
            this.hp = 0;
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
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
        int usePoint = 20;
        int recovPoint = 10;
        hero.setHp(hero.getHp() + usePoint);  //hero의 hp 20 회복
        this.setMp(this.getMp() - recovPoint);  //자신의 mp 소모
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());

        if (this.getMp() < 10) {
            System.out.println("마나가 부족합니다.");
        }


    }

    public static void main(String[] args) {
        Wizard wizard = new Wizard("마법사", 100, new Wand("지팡이", 10));
        wizard.setName("");
        wizard.setHp(-5);
        System.out.println(wizard.hp);
        wizard.setWand(null);

    }
}