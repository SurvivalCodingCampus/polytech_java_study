package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(int hp, int mp, String name, Wand wand) {
        setHp(hp);
        setMp(mp);
        setName(name);
        setWand(wand);
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp 값이 0 이하");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
        if (name.length() < 4) {
            throw new IllegalArgumentException("name is too short");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("wand class is null");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        if (hero == null) {
            throw new IllegalArgumentException("hero is null");
        }

        int basePoint = 10;
        int revocPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + revocPoint);
    }
}
