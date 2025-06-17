package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    @DisplayName("getAge가 올바르게 동작하는지")
    void testGetAge() {
        // given
        Person person = new Person("김종윤", 1996);

        // when
        int testCurrentYear = person.getAge();

        // then
        assertEquals(30, testCurrentYear);
    }
}
