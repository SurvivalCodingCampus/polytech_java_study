package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("나이 계산은 올해년도에서 birthYear 년도를 뺀 값을 리턴")
    void whatAge(){

        //given
        Person person = new Person("윤서연", 1999);

        //when(실행)
        person.setAge(1999);

        //then
        assertEquals(26, person.getAge());
    }

}