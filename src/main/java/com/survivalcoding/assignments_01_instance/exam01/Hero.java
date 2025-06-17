package com.survivalcoding.assignments_01_instance.exam01;

public class Hero {

    private String name;
    private int hp;

    Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void test(){
        System.out.println("이름 " + this.name);
        System.out.println(hp);
    }
}
