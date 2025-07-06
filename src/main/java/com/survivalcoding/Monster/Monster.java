package com.survivalcoding.Monster;

import com.survivalcoding.Character;

public abstract class Monster {
    private int hp;
    private  int mp;

    public Monster(int hp, int mp)
    {
        this.hp = hp;
        this.mp = mp;
    }

    public abstract void attack();

    public abstract void run();
}
