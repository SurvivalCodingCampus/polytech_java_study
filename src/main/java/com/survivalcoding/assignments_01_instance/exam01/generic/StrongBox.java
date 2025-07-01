package com.survivalcoding.assignments_01_instance.exam01.generic;

public class StrongBox<E> {
    private E data;
    private int count = 0;
    private final KeyType keyType;

    private int getLimitByKeyType() {
        switch (keyType) {
            case PADLOCK:
                return 1024;
            case BUTTON:
                return 10000;
            case DIAL:
                return 30000;
            case FINGER:
                return 1000000;
            default:
                throw new IllegalArgumentException("알 수 없음");
        }
    }

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void put(E data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public E get() {
        count++;
        if (count <= getLimitByKeyType()) {
            return null;
        }
        return data;
    }
}
