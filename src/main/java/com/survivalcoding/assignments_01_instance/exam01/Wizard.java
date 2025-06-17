package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {

    private String name;
    private Wand wand;
    private int hp;
    private int mp;


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wand getWand(){
        return wand;
    }
    public void setWand(Wand wand){
        this.wand = wand;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getMp(){
        return mp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }

void heal (Hero hero){
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
}


}








