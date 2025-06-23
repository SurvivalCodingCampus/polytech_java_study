package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("Person을 이름과 태어난 연도를 가진 생성한다")
    void createPerson() {
        //given
        String name = "KangChangHwan";
        int birthYear = 1995;
        //when
        Person person = new Person(name, birthYear);
        //then
        assertEquals(name, person.getName());
        assertEquals(birthYear, person.getBirthYear());

    }

    @Test
    @DisplayName("Person 생성시 이름이 비거나 null인경우 예외가 발생한다")
    void createPersonException() {
        //given//when//then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("", 1995));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person(null, 1995));
    }

    @Test
    @DisplayName("태어난 연도에서 현재 년도를 뺀 값이 나이로 반환된다")
    void getAge() {
        //given
        String name = "KangChangHwan";
        int birthYear = 1995;
        Person person = new Person(name, birthYear);
        //when
        //then
        assertEquals(LocalDateTime.now().getYear() - birthYear, person.getAge());
    }

}