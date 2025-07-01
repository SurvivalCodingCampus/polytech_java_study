package com.survivalcoding.assignments_01_instance.exam01.Monster;

public abstract class Character {
    public abstract void attack(Slime slime);

    public static void main(String[] args){
        Character character=new Character(){
            @Override
            public void attack(Slime slime){

            }
        };
    }
}
