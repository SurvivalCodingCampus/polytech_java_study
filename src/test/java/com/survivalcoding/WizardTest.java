package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    @Test
    @DisplayName("Wizard setter tests")
    void testWizardSetter() {
        assertThrows(IllegalArgumentException.class, () -> {
            Wizard merlin = new Wizard("Merlin", new Wand("W", 100.0)); // Short name exception must be thrown.
        });
    }
}