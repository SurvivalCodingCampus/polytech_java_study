package com.survivalcoding.assignments_01_instance.exam02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyrightTest {

    @Test
    @DisplayName("Copyright 생성 테스트")
    void create() {

        //given
        String name = "내사진저작권";
        long price = 1_000_000_000_000L;
        String icn = "12211121";

        //when
        Copyright copyright = new Copyright(name, price, icn);

        //then
        assertInstanceOf(Asset.class, copyright);
        assertInstanceOf(IntangibleAsset.class, copyright);
        assertEquals(name, copyright.getName());
        assertEquals(price, copyright.getPrice());
        assertEquals(icn, copyright.getIcn());
    }

}