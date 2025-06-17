package com.survivalcoding;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    Wizard(int hp, int mp, String name, Wand wand){
        setHp(hp);
        setMp(mp);
        setName(name);
        setWand(wand);
    }


    public int getHp(){
        return  hp;
    }

    public void setHp(int hp) {
        if (hp < 0){
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp <= 0){
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 합니다.");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new IllegalArgumentException("해당 이름(마법사)에 NULL을 집어넣었습니다");
        }
        if (3 > name.length()){
            throw new IllegalArgumentException("이름(마법사)은 최소 3글자 이상이어야 합니다.");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null){
            throw new IllegalArgumentException("마법사의 지팡이는 Null일수 없습니다.");
        }
        this.wand = wand;
    }
}
