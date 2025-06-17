package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    //생성자 만들기
    Wizard(int hp, int mp, String name, Wand wand) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    public int getHp() {
        return hp;
    }

    //5번-----------
    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    //4번-----------
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 음수가 될 수 없음");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    //1번------------
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

    //3번-----------
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("null 될 수 없음");
        }
        this.wand = wand;
    }

    void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }
}