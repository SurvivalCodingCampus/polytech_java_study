package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TangibleAssetTest {

    @Test
    @DisplayName("생성자를 통해 name, price, color이 잘 설정됐는지 테스트")
    void tangibleAssetAllFieldCorrectly() {
        TangibleAsset tangibleAsset = new TangibleAsset("name", 20000, "color");

        assertEquals("name", tangibleAsset.getName());
        assertEquals(20000, tangibleAsset.getPrice());
        assertEquals("color", tangibleAsset.getColor());
    }
}