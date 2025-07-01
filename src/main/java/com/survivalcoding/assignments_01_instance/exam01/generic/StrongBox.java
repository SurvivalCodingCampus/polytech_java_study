package com.survivalcoding.assignments_01_instance.exam01.generic;

public class StrongBox<E> {
    private E data;
    private int count = 0;

    public enum KeyType {
        PADLOCK,
        BUTTON,
        DIAL,
        FINGER
    }

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    KeyType keyType = KeyType.BUTTON;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        count++;
        return this.data;
    }
}
