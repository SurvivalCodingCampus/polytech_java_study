package com.survivalcoding.assignments_01_instance.exam01;

public class Slime {

    private final String suffix;
    private int hp;


    public Slime(String suffix) {
        if(suffix == null || suffix.trim().isEmpty()) {
            throw new IllegalArgumentException("suffix cannot be null or empty");
        }
        this.suffix = suffix;
    }

    public Slime(String suffix, int hp) {
        this(suffix);
        this.hp = hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Attackable attackable){
        int attackAmount = 10;

        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println( attackAmount + "의 데미지");

        attackable.takeDamage(attackAmount);
    }

}
