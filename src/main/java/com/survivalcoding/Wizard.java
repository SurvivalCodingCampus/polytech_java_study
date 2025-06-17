package com.survivalcoding;

public class Wizard {

    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero hero){
        int basePoint = 10;
        int recovPoint = (int)(basePoint*this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(hp<0){
            hp=0;
        }
    }

    public int getMp() {
        return mp;

    }

    public void setMp(int mp) {
        this.mp = mp;
        if(mp<=0){
            throw new IllegalArgumentException("mp는 0이상이어야 합니다.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name == null){
            throw new IllegalArgumentException("마법사의 이름은 null일 수 없습니다.");
        }
        if(name.length()<3){
            throw new IllegalArgumentException("마법사의 이름은 3문장 이상이어야 합니다.");
        }
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
        if(wand==null){
            throw new IllegalArgumentException("마법사의 지팡이는 Null이어서는 안됩니다.");
        }
    }
}
