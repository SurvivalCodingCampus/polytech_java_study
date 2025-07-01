package com.survivalcoding.generic;

public class StrongBox<E> {
    public final static int PADLOCK_COUNT = 1024;
    public final static int BUTTON_COUNT = 10000;
    public final static int DIAL_COUNT = 30000;
    public final static int FINGER_COUNT = 1000000;

    public final static int RESET_COUNT = 0;

    private E data;
    private KeyType keyType;
    private int count;

    // 생성자
    public StrongBox(E data, KeyType keytype) {
        this.data = data;
        this.keyType = keytype;
        this.count = RESET_COUNT;
    }

    public StrongBox(KeyType keytype) {
        this(null, keytype);
    }

    // count getset
    public int getCount() {
        return count;
    }

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        if (keyType == KeyType.PADLOCK) {
            if (count < PADLOCK_COUNT) {
                count++;
                return null;
            } else {
                count = RESET_COUNT;
                return data;
            }
        } else if (keyType == KeyType.BUTTON) {
            if (count < BUTTON_COUNT) {
                count++;
                return null;
            } else {
                count = RESET_COUNT;
                return data;
            }
        } else if (keyType == KeyType.DIAL) {
            if (count < DIAL_COUNT) {
                count++;
                return null;
            } else {
                count = RESET_COUNT;
                return data;
            }
        } else if (keyType == KeyType.FINGER) {
            if (count < FINGER_COUNT) {
                count++;
                return null;
            } else {
                count = RESET_COUNT;
                return data;
            }
        } else {
            return null;
        }
    }
}