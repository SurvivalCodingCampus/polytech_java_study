package com.survivalcoding;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric();

        cleric.selfAid();
        System.out.println(cleric.getHp() + " " + cleric.getMp());
        System.out.println();

        int healAmount = cleric.pray(3);
        System.out.println(healAmount);
    }
}