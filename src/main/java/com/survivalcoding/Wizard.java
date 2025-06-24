package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    Wizard(int hp, int mp, String name, Wand wand) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 음수가 될 수 없음");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("null이 될수 없음");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("3문자 이하 안됨");
        }

        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("null 될 수 없음");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        //int basePoint = 10;
        //int recovPoint = (int) (basePoint * this.wand.getPower());
        //hero.setHp(hero.getHp() + recovPoint);
        this.mp -= 10;
        hero.setHp(hero.getHp() + 20);
        System.out.println(getHp() + "힐을 시전했습니다. 대상 HP :");

        if (mp < 10) {
            System.out.println("마나가 부족합니다.");
            return;

        }


    }
}