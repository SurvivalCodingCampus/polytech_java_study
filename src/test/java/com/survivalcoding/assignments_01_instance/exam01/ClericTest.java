package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test //테스트를 수행한다는 메서드
    @DisplayName("Cleric이 등장했다")
    //설명을 적을 수 있다

   void test(){
       Cleric cleric = new Cleric("아서스", 40, 5);//클래스와 변수 선언
        //설정단계

        cleric.test();
        //변수랑 테스트 하고 싶은 함수
       assertEquals("아서스", cleric.name);
       assertEquals(40, cleric.hp);
       assertEquals(5, cleric.mp); //내가 원하는 답, 설정
    }
    @Test

    void test2(){
        Cleric cleric = new Cleric("아서스", 35);//클래스와 변수 선언
        //설정단계

        cleric.test2();
        //변수랑 테스트 하고 싶은 함수
        assertEquals("아서스", cleric.name);
        assertEquals(35, cleric.hp);
        assertEquals(10, cleric.mp);

    }
    @Test

    void test3(){
        Cleric cleric = new Cleric("아서스");//클래스와 변수 선언
        //설정단계

        cleric.test3();
        //변수랑 테스트 하고 싶은 함수
        assertEquals("아서스", cleric.name);
        assertEquals(50, cleric.hp);
        assertEquals(10, cleric.mp);

    }
    @Test

    void test4(){
        Cleric cleric = new Cleric("아서스");//클래스와 변수 선언
        //설정단계

        cleric.test4();
        //변수랑 테스트 하고 싶은 함수

    }
}