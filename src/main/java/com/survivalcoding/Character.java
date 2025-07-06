package com.survivalcoding;

public abstract class Character {
    String name;
    int hp;
    public void run()
    {
        System.out.println(name + "은 도망쳤다");
    }

    public abstract void attack(Kinoko kinoko);
}
