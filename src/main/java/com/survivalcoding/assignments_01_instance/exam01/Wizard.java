package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    protected Wizard() {
    } // 테스트 클래스에서만 사용가능하게 제한한다.

    public Wizard(int hp, int mp, String name, Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("Wand cannot be null");
        }
        if (mp < 0) {
            throw new IllegalArgumentException("Mp cannot be negative");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.wand = wand;
        this.hp = Math.max(0, hp);
        this.mp = mp;
    }

    public void heal(Healable healable) {
        if (mp - 10 <= 0) {
            System.out.println("마나가 부족합니다.");
            return;
        }
        mp -= 10;
        int basePoint = 20;
        healable.beHealed(basePoint);
        System.out.println("힐을 시전했습니다. 대상 HP : " + healable.getHp());
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWand(Wand wand) throws RuntimeException {
        if (wand == null) {
            throw new IllegalArgumentException("Wand cannot be null");
        }
        this.wand = wand;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("Mp cannot be negative");
        }
        this.mp = mp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
}
