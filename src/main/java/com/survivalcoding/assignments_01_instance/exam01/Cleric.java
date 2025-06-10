package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    private String name;
    private int hp;
    private int mp;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    protected Cleric() {
    }

    public Cleric(String name) {
        hp = MAX_HP;
        mp = MAX_MP;
        this.name = name;
    }

    protected Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void selfAid() throws IllegalStateException {
        int useAmountMp = 5;
        if( mp < useAmountMp ){
            throw new IllegalStateException("MP가 부족합니다.");
        }
        mp -= 5;
        hp = MAX_HP;
    }

    public int pray(int sec){
        int result = sec;

        result += getRandomNumber(0, 2);

        if( result + mp > MAX_MP ){
            throw new IllegalStateException("이미 MP가 최대치 입니다.");
        }

        return result;
    }

    public static int getRandomNumber(final int min, final int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
