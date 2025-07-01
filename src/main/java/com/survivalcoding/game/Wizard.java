package com.survivalcoding.game;

public class Wizard {
    private String name;
    private int hp;
    private int mp = 100;
    private Wand wand;

    // constructor

    // Placeholder, should modify it later
    public Wizard(String name, Wand wand) {
        this(name, 50, 100, wand);
    }

    public Wizard(String name, int hp, int mp, Wand wand) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        if (name.length() < 3) throw new IllegalArgumentException("Length of name must have at least 3 characters");
        if (wand == null) throw new IllegalArgumentException("Wizard must have a wand");
        if (hp < 0) System.out.println("hp is set to 0 because you were trying to set it less than 0");
        if (mp < 0) throw new IllegalArgumentException("mp cannot go below 0");
        setName(name);
        this.wand = wand;
        setHp(hp);
        setMp(mp);
    }

    // getter
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Wand getWand() {
        return wand;
    }

    // setter
    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null.");
        if (name.length() < 3) throw new IllegalArgumentException("Length of name must have at least 3 characters");
        this.name = name;
    }

    public void setHp(int hp) {
        if (hp < 0) System.out.println("hp is set to 0 because you were trying to set it less than 0");
        this.hp = Math.max(hp, 0);
    }

    public void setMp(int mp) {
        if (mp < 0) throw new IllegalArgumentException("mp cannot go below 0");
        this.mp = mp;
    }

    public void setWand(Wand wand) {
        if (wand == null) throw new IllegalArgumentException("Wizard must have a wand");
        this.wand = wand;
    }

    // methods
    public void heal(Hero hero) {
        if (hero == null) throw new IllegalArgumentException("Heal must have an ally as a target");
        if (getMp() < 10) {
            System.out.println("마나가 부족합니다.");
            throw new IllegalArgumentException("Insufficient MP");
        }
        setMp(getMp() - 10);

        hero.setHp(hero.getHp() + 20);
        System.out.println("힐을 시전했습니다. 대상 HP : " + hero.getHp());
    }
}
