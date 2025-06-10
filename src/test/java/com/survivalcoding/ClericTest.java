package com.survivalcoding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    //준비
    Cleric cleric = new Cleric();
    //실행
    //검증

    @Test
    @DisplayName("MP사용시 MP가 -5감소하고, HP MAX 된다.")
    void Test2() {
        Cleric cleric = new Cleric();

        cleric.selfAid();

        assertEquals(5, cleric.hp);
        assertEquals(-5, cleric.mp);
    }

    @Test
    @DisplayName("pray 사용시 자신의 MP 5증가한다.")
    void Test3() {
        Cleric cleric = new Cleric();

        cleric.pray();

        assertEquals(2,cleric.mp);

    }
}