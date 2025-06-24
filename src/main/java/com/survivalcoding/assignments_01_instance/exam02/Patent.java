package com.survivalcoding.assignments_01_instance.exam02;

public class Patent extends IntangibleAsset {

    private final String registrationNumber;

    public Patent(String name, long price,  String registrationNumber) {
        super(name, price);
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
