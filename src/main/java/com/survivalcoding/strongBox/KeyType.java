package com.survivalcoding.strongBox;

public enum KeyType {
    // You can code enum as 'class'?
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    // field?
    private int threshold;

    // constructor?
    KeyType(int threshold) {
        this.threshold = threshold;
    }

    // getter?
    public int getThreshold() {
        return threshold;
    }
}
