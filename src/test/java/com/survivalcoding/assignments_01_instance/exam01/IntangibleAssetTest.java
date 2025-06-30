package com.survivalcoding.assignments_01_instance.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntangibleAssetTest {

    @Test
    @DisplayName("생성자를 통해 name, price이 잘 설정됐는지 테스트")
    void intangibleAssetAllFieldCorrectly() {
        IntangibleAsset intangibleAsset = new IntangibleAsset("name", 14000);

        assertEquals("name", intangibleAsset.getName());
        assertEquals(14000, intangibleAsset.getPrice());
    }

}