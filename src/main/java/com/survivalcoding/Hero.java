package com.survivalcoding;

public class Hero {

    String name;
    int hp;
    int mp;

    public void setHp(int hp){
        if(hp<0){
            throw new IllegalArgumentException("hp는 음수로 들어올 수 없습니다");
        }
        this.hp = hp;
    }


    public int getMp() {
        return mp;
    }
}
