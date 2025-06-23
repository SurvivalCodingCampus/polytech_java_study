package com.survivalcoding.assignments_01_instance.exam01;

public class Slime {
    final String suffix;
    int hp;

    void attack(Hero hero){
        System.out.println("슬라임 "+ suffix + "이/가 공격했다");
        System.out.println("10의 데미지");

        hero.setHp(hero.getHp() - 10);
    }
}
