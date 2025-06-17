package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonTest {
    @Test
    void testConstructor() {
        Person person = new Person("가나초콜릿", 2000);

        assertEquals("가나초콜릿", person.getName());
        assertEquals(2000, person.getBirthYear());
        assertEquals(25, person.getAge());
    }

    @Test
    void testConstructor2() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person(null, -101);
        });


    }

    @Test
    void testConstructor3() {


        assertThrows(IllegalArgumentException.class, () -> {
            new Person("awd", -101);
        });
    }
}