package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
//
    @Test
    public void persontest(){
    Person person = new Person("name",1999);
    assertEquals("name",person.getName());
    assertEquals(1999,person.getBirthYear());
    }
}