package com.survivalcoding;

public class Cleric {
    String name;
    static final int max_Hp = 50;
    static final int max_Mp = 10;
    int Hp, Mp;
    int time;

    Cleric(String name, int Hp, int Mp)
    {
        this.name = name;
        this.Hp = Hp;
        this.Mp = Mp;
        selfAid();
        prey(time);
    }
/*
    Cleric(String name, int Hp)
    {
        this(name, Hp, Cleric.max_Mp);
    }

    Cleric(String name)
    {
        this(name, Cleric.max_Hp, Cleric.max_Mp);
    }
*/
    void selfAid()
    {
        if(Mp >= 5) {
            Mp -= 5;
        }
        else Mp = 0;
        Hp = max_Hp;
    }
    public int prey(int time)
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
        return Mp;
    }



}
