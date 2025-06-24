package com.survivalcoding.AssetTest;

import com.survivalcoding.Asset.Patent;
import com.survivalcoding.Asset.IntangibleAsset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntangibleAssetTest {
    Patent patent = new Patent("KJY", "모든특허다내꺼", 1000000000, "20300101");

    @Test
    @DisplayName("Patent get, set")
    void patentTest() {
        assertEquals("20300101", patent.getExpireDate());
    }

    @Test
    @DisplayName("무형자산 메서드 테스트")
    void AssetMethodTest() {
        assertEquals("KJY", patent.getOwner());
        assertEquals("모든특허다내꺼", patent.getName());
        assertEquals(1000000000, patent.getPrice());
        assertEquals("20300101", patent.getExpireDate());
    }
}
