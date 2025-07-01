package com.survivalcoding.assignments_01_instance.exam01;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Wand;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WandTest {
    Wand wand;

    @BeforeEach
    void setUp() {
        Wand wand = new Wand("구부러진 지팡이");
    }

    @AfterEach
void tearDown() {
        System.out.println("끝날 때");
    }
    @Test
    @DisplayName("지팡이의 이름은 null일 수 없다")
    void setNameTest1(){
        assertThrows(IllegalArgumentException.class,() ->{
            wand.setName(null);
         });
    }

    @Test
    @DisplayName("지팡이의 이름은 3글자 이상이어야 한다")
    void setNameTest2(){

    }
}