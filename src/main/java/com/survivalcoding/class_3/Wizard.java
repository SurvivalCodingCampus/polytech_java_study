package com.survivalcoding.class_3;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard() {
        this(10,10,"홍길동");
    }
    public Wizard(int hp, int mp, String name) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(name);
    }
    public Wizard(int hp, int mp, String name, Wand wand) {
        this.setHp(hp);
        this.setMp(mp);
        this.setName(name);
        this.setWand(wand);
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        if (this.wand == null) {
            throw new IllegalArgumentException("지팡이가 설정되지 않았습니다");
        }
        int recovPoint = (int) (basePoint * this.wand.getPower()); // 지팡이에 의한 증폭

        hero.setHp((hero.getHp()) + recovPoint);   // 용사의 HP를 회복
    }

    // getter
    public Wand getWand() {
        return wand;
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

    // setter
    public void setWand(Wand wand) {
        if(wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null이 아니어야 함");
        }
        this.wand = wand;
    }
    public void setHp(int hp) {
        if(hp < 0) {
            this.hp = 0;
        }
        else{
            this.hp = hp;
        }
    }
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 함");
        }
        this.mp = mp;
    }
    public void setName(String name) {
        this.name = name;
    }
}
