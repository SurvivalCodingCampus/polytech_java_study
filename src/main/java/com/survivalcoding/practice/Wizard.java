package com.survivalcoding.practice;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(int hp, int mp, String name, Wand wand) {
        // 유효성 검사
        if (name == null) {
            throw new IllegalArgumentException("마법사 이름은 반드시 입력해 주세요");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("마법사 이름은 3글자 이상이어야 합니다");
        }
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 mp는 0 이상이어야 합니다");
        }
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없습니다");
        }
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }

        this.mp = mp;
        this.name = name;
        this.wand = wand;
    }

    void heal(Hero hero) {
        int basePoint = 10;
        int recoveryPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recoveryPoint);
    }

    // getter, setter
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
