package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    public void test(){
        Wizard wizard = new Wizard(30, 20, "마법사");

        wizard.wizardTest();

        assertEquals("a", wizard.getName());
        assertEquals(10, wizard.getHp());
        assertEquals(20, wizard.getMp());

        wizard.setHp(10);
        wizard.setMp(10);
        wizard.setName("마법사");


    }
}