package com.survivalcoding.assignments_01_instance.exam02;

public class Copyright extends IntangibleAsset {

    private final String icn;

    public Copyright(String name, long price, String icn) {
        super(name, price);
        this.icn = icn;
    }

    public String getIcn() {
        return icn;
    }
}
