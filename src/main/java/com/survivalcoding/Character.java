package com.survivalcoding;

public abstract class Character {

    public abstract void attack(Slime slime);

    public static void main(String[] args) {
//        Character c = new Character();
        Character character = new Character() {
            @Override
            public void attack(Slime slime) {

            }
        };
    }
}