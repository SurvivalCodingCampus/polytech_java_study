package com.survivalcoding.assignments_01_instance.exam01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {

    @Test
    public void testHeal() {
        // 준비 (Arrange)
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

}




