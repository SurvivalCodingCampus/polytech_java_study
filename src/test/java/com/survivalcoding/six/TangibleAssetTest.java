package com.survivalcoding.six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TangibleAssetTest {
    static class Temp extends TangibleAsset {
        Temp(String name, int price, String color, double weight) {
            super(name, price, color, weight);
        }
    }

    Temp asset;

    @BeforeEach
    void setUp() {
        asset = new Temp("Box", 500, "Red", 2.3);
    }

    @Test
    @DisplayName("정상 생성 및 getter")
    void testConstructorAndGetters() {
        assertAll("constructor and getters",
                () -> assertEquals("Box", asset.getName()),
                () -> assertEquals(500, asset.getPrice()),
                () -> assertEquals("Red", asset.getColor()),
                () -> assertEquals(2.3, asset.getWeight())
        );
    }

    @Test
    @DisplayName("Constructor 예외")
    void testConstructorNullColor() {
        assertThrows(IllegalArgumentException.class,
                () -> new Temp("Box", 500, null, 1.0));
        assertThrows(IllegalArgumentException.class,
                () -> new Temp("Box", 500, "Red", -0.1));

        asset.setColor("Blue");

        assertEquals("Blue", asset.getColor());
        assertThrows(IllegalArgumentException.class, () -> asset.setColor(null));

        asset.setWeight(4.5);

        assertEquals(4.5, asset.getWeight());
        assertThrows(IllegalArgumentException.class, () -> asset.setWeight(-2.0));
    }

}