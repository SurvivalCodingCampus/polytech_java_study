package com.survivalcoding.monster;

public class Goblin extends WalkingMonster {

    @Override
    public void attack() {

    }

    @Override
    public void run() {
        super.run();
        System.out.println("Goblin run");
    }
}
