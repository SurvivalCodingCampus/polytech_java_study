package com.survivalcoding.practice;

public class StrongBox<E> {
    private E item;
    private KeyType keyType;
    private int keyLimit;
    private int keyUseCount;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
        setKeyLimit(keyType);
        keyUseCount = 0;
    }

    public StrongBox(E item, KeyType keyType) {
        this(keyType);
        this.item = item;
    }

    public void put(E item) {
        this.item = item;
        setKeyLimit(keyType);
        keyUseCount = 0;
    }

    public E get() {
        if (item == null) {
            System.out.println("금고 안이 비어있습니다");
            return null;
        }
        if (keyUseCount <= keyLimit) {
            keyUseCount++;
            return null;
        }
        return this.item;
    }

    private void setKeyLimit(KeyType keyType){
        switch (keyType) {
            case PADLOCK:
                keyLimit = 1024;
                break;
            case BUTTON:
                keyLimit = 10000;
                break;
            case DIAL:
                keyLimit = 30000;
                break;
            case FINGER:
                keyLimit = 1000000;
                break;
            default:
                keyLimit = 0;
        }
    }
}
