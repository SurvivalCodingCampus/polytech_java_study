package com.survivalcoding;

public class Cleric {
    String name;
    static int max_Hp = 50;
    static int max_Mp = 10;
    int Hp, Mp;
    int time;

    public Cleric(String name, int Hp, int Mp)
    {
        this.name = name;
        this.Hp = 50;
        this.Mp = 10;
    }

    void selfAid()
    {
        if(Mp >= 5) {
            Mp -= 5;
            Hp = max_Hp;
        }
    }
    int prey(int time)
    {
        int heal;
        if(time > 0) {
            heal = (int) (Math.random() * 2) + time;
        }
        else heal = 0;

        if(Mp + heal > max_Mp)
        {
            heal = max_Mp - Mp;
        }
        Mp = Mp + heal;
        return heal;
    }



}
