package com.survivalcoding.assignments_01_instance.exam01;
import java.util.Random;

public class Cleric {

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public String name;
    public int HP = MAX_HP;
    public int MP = MAX_MP;

    public Cleric(String name) {
        this.name = name;
    }

    public void selfAid(){
        if(MP>=5)
        {
            if(HP < MAX_HP)
            {
                HP = MAX_HP;
                MP -= 5;
            }
            else {
                MP -= 5;
            }
        }
    }

    public int pray(int sec){
        int extra = (int)(Math.random()*3);

        int recover = sec + extra;

        if(MP + recover > MAX_MP){
            recover = MAX_MP - MP;
        }
        MP += recover;

        return recover;
    }


    }


