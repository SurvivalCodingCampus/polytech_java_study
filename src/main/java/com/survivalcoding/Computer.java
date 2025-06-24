package com.survivalcoding;

public class Computer extends TangibleAsset {
    private String makerName;

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        if (makerName == null) throw new IllegalArgumentException("Maker name must be set. Check the computer's tag");
        this.makerName = makerName;
    }
}
