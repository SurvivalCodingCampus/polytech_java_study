package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0; // 음수가 들어오면 0으로 설정
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 함");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("마법사의 이름은 null이 아니고 3문자 이상이어야 함");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없음");
        }
        this.wand = wand;
    }

    void heal(Hero hero) {
        int basePoint = 10; // 기본회복 포인트
        int recovPoint = (int)(basePoint * this.wand.getPower()); // 지팡이에 의한 증폭
        hero.setHp(hero.getHp() + recovPoint); // 용사의 HP를 회복
    }
}
