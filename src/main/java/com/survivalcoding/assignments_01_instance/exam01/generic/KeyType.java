package com.survivalcoding.assignments_01_instance.exam01.generic;

public enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int limit;

    KeyType(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
