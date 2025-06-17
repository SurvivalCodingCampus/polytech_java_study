package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {
    @Test
    @DisplayName("이름은 null이 아니어야 함")
    void testwizardname() {
        //given
        Wizard wizard = new Wizard("마법사", 100, 50);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("");
        });
    }

    @Test
    @DisplayName("이름은 3글자 이상이어야 함")
    void testwizardname2() {
        //given
        Wizard wizard = new Wizard("마법사", 100, 50);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("마법");
        });
    }

    @Test
    @DisplayName("이름은 3글자 이상이어야 함")
    void testwizardmp() {
        //given
        Wizard wizard = new Wizard("마법사", 100, 50);

        // then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-5);
        });
    }

}