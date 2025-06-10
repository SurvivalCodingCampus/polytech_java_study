package com.survivalcoding;

import com.survivalcoding.assignments_01_instance.exam01.Cleric;

public class Main {
    public static void main(String[] args) {
        Cleric cleric = new Cleric("Cleric1");
        cleric.selfAid();
        cleric.pray(3);
    }
}