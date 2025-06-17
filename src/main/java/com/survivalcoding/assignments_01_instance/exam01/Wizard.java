package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;


    public void hael(Healable healable) {
        int basePoint = 10;
        int recoverPoint = (int) (basePoint * this.wand.getPower());
        healable.beHealed(recoverPoint);
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
        if(wand == null){
            throw new IllegalArgumentException("Wand cannot be null");
        }
    }

    public void setMp(int mp) {
        if(mp < 0){
            throw new IllegalArgumentException("Mp cannot be negative");
        }
        this.mp = mp;
    }
    public void setHp(int hp) {
        if(hp < 0){
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }
}
