package com.survivalcoding.assignments_01_instance.exam01;


enum KeyType {
    PADLOCK(1024),
    BUTTON(10000),
    DIAL(30000),
    FINGER(1000000);

    private final int maxUsageCount;

    KeyType(int maxUsageCount) {
        this.maxUsageCount = maxUsageCount;
    }

    public int getMaxUsageCount() {
        return maxUsageCount;
    }
}

public class StrongBox<T> {
    private T item;
    private KeyType keyType;
    private int usageCount = 0;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        usageCount++;
        if (usageCount >= keyType.getMaxUsageCount()) {
            return item;
        }
        return null;
    }
}