package com.survivalcoding;

public class Patent extends IntangibleAsset {
    private int registrationNumber;

    public Patent(String name, int registrationNumber) {
        super(name);
        this.registrationNumber = registrationNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}

