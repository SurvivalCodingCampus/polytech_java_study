package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

@Test
    void test()
{
    Person person = new Person("이름", 2024);

    person.ageTest();

    assertEquals("이름", person.getName());
    assertEquals(2024, person.getBirthYear());

}

}