package com.survivalcoding;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    @DisplayName("Person 테스트")
    void person(){
        Person person = new Person("진현규",1999);
        assertEquals(26,person.getAge());
        assertEquals("진현규",person.getName());
        assertEquals(1999,person.getBirthYear());
    }

}