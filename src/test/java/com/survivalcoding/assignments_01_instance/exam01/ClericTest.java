package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {
    @Test //테스트를 수행한다는 메서드
    @DisplayName("Cleric이 등장했다")
    //설명을 적을 수 있다

   void test(){
       Cleric cleric = new Cleric(); //클래스와 변수 선언
        cleric.name = "Cleric";//설정단계

        cleric.test();
        //변수랑 테스트 하고 싶은 함수

        assertEquals("Cleric", cleric.name); //내가 원하는 답, 설정
    }

}