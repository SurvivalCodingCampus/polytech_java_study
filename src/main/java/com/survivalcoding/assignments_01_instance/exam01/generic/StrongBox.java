package com.survivalcoding.assignments_01_instance.exam01.generic;

public class StrongBox<E> {
    private E data;
    private int count = 0;
    private KeyType keyType;
    
    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        count++;
        if (count < keyType.getLimit()) {
            return null;
        }
        return this.data;
    }
}
