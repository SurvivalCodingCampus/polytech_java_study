package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    @DisplayName("Wizard getter setter 확인")
    void getsetWizard(){
        Wizard wizard = new Wizard();
        Wand wand = new Wand();

        // get set wand
        assertThrows(IllegalArgumentException.class,()->{
            wizard.setWand(null);
        });
        wizard.setWand(wand);
        assertEquals(wand,wizard.getWand());

        // get set Hp
        wizard.setHp(100);
        assertEquals(100,wizard.getHp());
        wizard.setHp(-10);
        assertEquals(0,wizard.getHp());

        // get set Mp
        assertThrows(IllegalArgumentException.class,()->{
            wizard.setMp(-10);
        });
        wizard.setMp(10);
        assertEquals(10,wizard.getMp());
    }

}