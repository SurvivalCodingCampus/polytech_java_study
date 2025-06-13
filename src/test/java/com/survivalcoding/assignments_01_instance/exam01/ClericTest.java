package com.survivalcoding.assignments_01_instance.exam01;


import org.junit.jupiter.api.Test;

class ClericTest {

    public String name = "Cleric";

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    public int HP = MAX_HP;
    public int MP = MAX_MP;


        @Test
        public void test() {
            System.out.println("name" + name);
            System.out.println("HP" + HP);
            System.out.println("MP" + MP);
        }

    }



