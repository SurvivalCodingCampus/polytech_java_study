package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {


    @Test
    @DisplayName("2001년생은 현재 만25세가 나와야한다.")
    void testPerson() {

        //given(준비)
        Person person = new Person("김민지", 2001);

        //when(실행)
        // 현재 연도 구하기
//        Calendar cal = Calendar.getInstance();
//        int currentYear = cal.get(Calendar.YEAR);
//
//        // 기대값: 현재 연도 - 2000
//        int expectedAge = currentYear - 2000;

        // 실제값: getAge() 결과
        //int actualAge = person.getAge();
        //then(검증)
        assertEquals(25, person.getAge());

    }
}