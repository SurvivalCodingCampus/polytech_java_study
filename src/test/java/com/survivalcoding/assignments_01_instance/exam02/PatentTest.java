package com.survivalcoding.assignments_01_instance.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PatentTest {


    @Test
    @DisplayName("Patent 생성 테스트")
    void create() {

        //given
        String name = "AI특허";
        long price = 1_000_000_000_000L;
        String registrationNumber = "135748524545332585";

        //when
        Patent patent = new Patent(name, price, registrationNumber);

        //then
        assertInstanceOf(Asset.class, patent);
        assertInstanceOf(IntangibleAsset.class, patent);
        assertEquals(name, patent.getName());
        assertEquals(price, patent.getPrice());
        assertEquals(registrationNumber, patent.getRegistrationNumber());
    }

}