package com.survivalcoding.eight;

public class StrongBox<E> {
    public final static int PADLOCK_COUNT = 1024;
    public final static int BUTTON_COUNT = 10000;
    public final static int DIAL_COUNT = 30000;
    public final static int FINGER_COUNT = 1000000;
    int count = 0;
    private E obj;
    private KeyType keyType;
    int checkButton = 0;

    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        if (keyType == null) {
            throw new IllegalArgumentException("keyType is null");
        }
        this.keyType = keyType;
    }

    public void put(E obj) {
        this.obj = obj;
        if (this.keyType == KeyType.FINGER) {
            checkButton = FINGER_COUNT;
        } else if (this.keyType == KeyType.BUTTON) {
            checkButton = BUTTON_COUNT;
        } else if (this.keyType == KeyType.PADLOCK) {
            checkButton = PADLOCK_COUNT;
        } else if (this.keyType == KeyType.DIAL) {
            checkButton = DIAL_COUNT;
        }
        count = 0;
    }

    public E get() {
        count++;
        if (this.keyType == KeyType.PADLOCK && count > PADLOCK_COUNT) {
            return this.obj;
        }
        if (this.keyType == KeyType.BUTTON && count > BUTTON_COUNT) {
            return this.obj;
        }
        if (this.keyType == KeyType.DIAL && count > DIAL_COUNT) {
            return this.obj;
        }
        if (this.keyType == KeyType.FINGER && count > FINGER_COUNT) {
            return this.obj;
        }
        return null;
    }

    public StrongBox(E obj, KeyType key) {
        put(obj);
        setKeyType(key);
    }

    public StrongBox(KeyType key) {
        this(null, key);
    }

    public static void main(String[] args) {
        StrongBox<Integer> ar = new StrongBox<>(KeyType.FINGER);
        ar.put(1);
        for (int i = 0; i <= StrongBox.FINGER_COUNT; i++) {
            ar.get();
        }
        System.out.println(ar.get());
    }
}
