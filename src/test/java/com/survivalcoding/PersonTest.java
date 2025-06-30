package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    @DisplayName("2000년 생은 25살이다")
    void getAge() {
        Person person = new Person("홍길동", 2000);
        assertEquals(25, person.getAge());
    }
}