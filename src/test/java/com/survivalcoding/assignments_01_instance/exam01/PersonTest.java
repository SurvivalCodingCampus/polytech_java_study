package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {


    @Test
    @DisplayName("나이 계산은 올해 년도에서 birthyear 년도를 뺀 값을 리턴한다.")
    void testperson_getAge() {
        //given
        Person person = new Person("김민지", 2001);

        // then

        assertEquals(24, person.getAge());   //hp = 최대
    }
}