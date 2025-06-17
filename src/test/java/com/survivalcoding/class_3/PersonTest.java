package com.survivalcoding.class_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    @DisplayName("age 반환 테스트")
    void returnAge() {
        Person person = new Person("해원", 2000);
        assertEquals(26,person.getAge());
    }
}