package com.survivalcoding.generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrongBoxTest {
    @Test
    @DisplayName("String 타입으로 put()/get() 확인")
    void inputString() {
        StrongBox<String> instance = new StrongBox<>();
        String str = "JAVA";

        instance.put(str);
        assertEquals(str, instance.getInstance());
    }

    @Test
    @DisplayName("double 타입으로 put()/get() 확인")
    void inputDouble() {
        StrongBox<Double> instance = new StrongBox<>();
        Double d = 3.141592;

        instance.put(d);
        assertEquals(d, instance.getInstance());
    }

}