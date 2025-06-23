package com.survivalcoding;

public class Wizard {

    private int hp;
    private int mp=100;
    private String name;
    private Wand wand;

    public void heal(Hero hero) {

        mp= getMp()-10;
        hero.Hp = hero.getHp()+20;

        if(getMp() <10){
            System.out.println("마나가 부족합니다!");
            throw new IllegalArgumentException("마나가 부족합니다!");
        }
        else{
            System.out.println("힐을 시전했습니다. 대상 HP: "+hero.getHp());
        }
    }

    Wizard(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Wizard(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
        if (mp <= 0) {
            throw new IllegalArgumentException("mp는 0이상이어야 합니다.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name == null) {
            throw new IllegalArgumentException("마법사의 이름은 null일 수 없습니다.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("마법사의 이름은 3문장 이상이어야 합니다.");
        }
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 Null이어서는 안됩니다.");
        }
    }
}
