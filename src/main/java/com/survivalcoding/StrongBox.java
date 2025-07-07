package com.survivalcoding;

public class StrongBox<K> {
    private K item;
    private final KeyType keyType;
    private int useCount;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        this.useCount = 0;
    }

    public void put(K item) {
        this.item = item;
    }

    public K get() {
        useCount++;
        if (useCount < keyType.getLimit()) {
            return null;
        } else {
            return item;
        }
    }
}

