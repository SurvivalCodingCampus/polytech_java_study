package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {

    @Test
    @DisplayName("selfAid()를 하면 mp-5 하면 hp = maxhp가 된다")
    void testWizard() {

        //given(준비)
        final Wizard wizard = new Wizard("김상무", 20, 5);

        //when(실행)

        //then(검증)
        assertThrows(IllegalArgumentException.class, () -> wizard.setMp(-1));
    }

}