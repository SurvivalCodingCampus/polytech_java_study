package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {

    private String name;
    private Wand wand;
    private int hp;
    private int mp = 100;


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
        if(this.hp<0){
            hp = 0;
        }
        this.hp = hp;
    }
    public int getMp(){
        return mp;
    }
    public void setMp(int mp){
        if(this.mp<0){
            throw new IllegalArgumentException("메세지");
        }
        this.mp = mp;
    }

void heal (Hero hero){
        //int basePoint = 10;
       // int recovPoint = (int) (basePoint * this.wand.getPower());
       // hero.setHp(hero.getHp() + recovPoint);

        if (mp >= 10) {
           mp -= 10;
           hero.setHp(hero.getHp() + 20);

           System.out.println("HP: "+ hero.getHp());
        }
        else {
            System.out.println("마나가 부족합니다.");
        }
}

}








