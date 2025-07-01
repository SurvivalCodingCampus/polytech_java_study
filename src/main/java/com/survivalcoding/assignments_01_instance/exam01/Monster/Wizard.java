package com.survivalcoding.assignments_01_instance.exam01.Monster;

public class Wizard {
    private int hp;
    private int mp = 100;
    private String name;
    private Wand wand;

    public int getHp() {
        return hp;
    }

    //HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    //마법사의 MP는 0 이상이어야 한다.
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("mp는 음수가 될 수 없음");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    //마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("이름은 3자 이상");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    //마법사의 지팡이는 null 일 수 없다.
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("Wand는 null이 될 수 없음");
        }
        this.wand = wand;
    }
    //void heal(Hero hero) : hp를 20 회복시키고 자신의 mp를 10 소모
    public void heal(Hero hero) {
        //mp가 부족하면 "마나가 부족합니다" 출력
        if (mp < 10) {
            System.out.println("마나가 부족합니다");
            return;
        }
        hero.setHp(hero.getHp() + 20);
        this.mp -= 10;

        System.out.println("힐을 시전했습니다. HP:" + hero.getHp());
        //힐을 성공하면 "힐을 시전했습니다. 대상 HP: XX" 출력
    }

}








