package com.survivalcoding.assignments_01_instance.exam01;

public class Cleric {

    private String name;
    private int hp;
    private int mp;

    public static final int MAX_HP = 50;
    public static final int MAX_MP = 10;

    protected Cleric() {
    }

    public Cleric(String name) throws RuntimeException{
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

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

    public void selfAid() throws RuntimeException {
        int useAmountMp = 5;
        if( mp < useAmountMp ){
            throw new IllegalStateException("MP가 부족합니다.");
        }
        mp -= useAmountMp;
        hp = MAX_HP;
    }

    public int pray(int sec) throws RuntimeException {
        if(sec <= 0){
            throw new IllegalStateException("sec은 0이나 음수일 수 없습니다.");
        }
        if(mp == MAX_MP){
            throw new IllegalStateException("MP가 이미 최대치입니다.");
        }

        int beforeMp = mp;
        int result = sec + getRandomNumber(0, 2);

        if( result + mp > MAX_MP ){
            mp = MAX_MP;
            return mp - beforeMp;
        }else{
            mp += result;
            return result;
        }
    }

    public static int getRandomNumber(final int min, final int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
