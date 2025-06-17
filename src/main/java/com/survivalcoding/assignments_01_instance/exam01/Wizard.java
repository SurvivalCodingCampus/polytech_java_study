package com.survivalcoding.assignments_01_instance.exam01;

public class Wizard {
    int hp;
    int mp;
    String name;
    Wand wand;

    public int getHp() {
        return hp;
    }
    //HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다.
    public void setHp(int hp) {
        if(hp<0){
            throw new IllegalArgumentException("hp는 음수가 될 수 없음");
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }
    //마법사의 MP는 0 이상이어야 한다.
    public void setMp(int mp) {
        if(mp<0){
            throw new IllegalArgumentException("mp는 음수가 될 수 없음");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }
    //마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("name은 null이 될 수 없음");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }
    //마법사의 지팡이는 null 일 수 없다.
    public void setWand(Wand wand) {
        if(wand==null){
            throw new IllegalArgumentException("Wand는 null이 될 수 없음");
        }
        this.wand = wand;
    }

    }

    /*void heal(Hero hero){
        int basePoint=10;
        int recovPoint=(int) (basePoint*this.wand.power);
        hero.setHp(hero.getHp()+recovPoint);
    }*/






