package com.survivalcoding.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssetTest {
    static class Temp extends Asset {
        Temp(String name, int price) {
            super(name, price);
        }
    }

    Temp temp;

    @BeforeEach
    void setUp() {
        temp = new Temp("Unity", 2020);
    }

    @Test
    @DisplayName("정상 생성 및 getter")
    void testConstructorAndGetters() {
        assertAll("constructor and getters",
                () -> assertEquals("Unity", temp.getName()),
                () -> assertEquals(2020, temp.getPrice())
        );
    }

    @Test
    @DisplayName("생성자 테스트")
    void testConstructorNull() {
        assertThrows(IllegalArgumentException.class, () -> new Temp("Box", -500));
        assertThrows(IllegalArgumentException.class, () -> new Temp(null, 500));

    }

}