package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatWizardTest {
    @Test
    @DisplayName("hero의 hp를 20 회복시키고 자신의 mp를 10 소모")
    void testGreatwizard() {
        //given

        GreatWizard greatWizard = new GreatWizard("Wizard", 100, new Wand("지팡이", 60.0));


        // then
        assertEquals(150, greatWizard.getMp());
    }

}