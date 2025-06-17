package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test

 public void test()
    {
        Hero hero = new Hero("아서", 40);

        hero.test();

        assertEquals("아서", hero.getName());


    }

}