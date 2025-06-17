package com.survivalcoding.assignments_01_instance.exam01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {

    @Test
    public void testHeal() {
        Hero hero = new Hero();
        hero.setHp(30);

        Wand wand = new Wand();
        wand.setName("wand");
        wand.setPower(1.5);

        Wizard wizard = new Wizard();
        wizard.setName("wizard");
        wizard.setHp(50);
        wizard.setMp(100);
        wizard.setWand(wand);

        wizard.heal(hero);

        assertEquals(45, hero.getHp());

    }


    @Test
    public void ver3texttest(){
        Wand wand = new Wand();
        wand.setName("abc");
        assertEquals("abc",wand.getName());
    }

    @Test
    public void powertest(){
        Wand wand = new Wand();
        wand.setPower(0.5);
        assertEquals(0.5,wand.getPower());
    }

    @Test
    public void mpoverzerotest(){
        Wizard wizard = new Wizard();
        wizard.setMp(0);

        assertEquals(0,wizard.getMp());
    }

    @Test
    public void turnintominustozerotest(){
        Wizard wizard = new Wizard();

        wizard.setHp(-10);
        assertEquals(0,wizard.getHp());

    }

}




