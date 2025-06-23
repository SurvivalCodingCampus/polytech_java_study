package com.survivalcoding.assignments_01_instance.exam01;

public class Slime {

    private String suffix;

    public void attack(Attackable attackable){
        System.out.println("슬라임 " + suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        attackable.takeDamage(10);
    }

}
