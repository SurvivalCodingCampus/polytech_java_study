package com.survivalcoding;

public class Cleric {
    String name;
    int max_Hp = 50;
    int max_Mp = 10;
    int Hp, Mp;
    int time;

    public Cleric()
    {
        this.name = name;
        this.Hp = 50;
        this.Mp = 10;
    }

    void selfAid()
    {
        Mp -= 5;
        Hp = max_Hp;
    }
    int prey(int time)
    {
        Mp = Mp + (int) (Math.random() * 2) + time;
        if(Mp > max_Mp) {
            Mp = max_Mp;
        }
        return Mp;
    }
}
