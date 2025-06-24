package com.survivalcoding.monster;

public class WarWolf extends WalkingMonster {
    @Override
    public void attack() {
        System.out.println("WarWolf attack");
    }

    @Override
    public void run() {
        super.run();

        System.out.println("WarWolf run");
    }
}
