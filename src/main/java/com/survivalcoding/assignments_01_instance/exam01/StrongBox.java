package com.survivalcoding.assignments_01_instance.exam01;

public class StrongBox<E> {
    private E data;
    private KeyType keyType;
    private int count;

    public void put(E data) {
        this.data = data;
    }

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public E get() {
        count++;

        if(count<=keyType.getLimit()) {
            return null;
        }

        return this.data;
    }

    public enum KeyType {
        PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

        private final int limit;

        KeyType(int limit) {
            this.limit = limit;
        }

        public int getLimit() {
            return limit;
        }
    }
}
