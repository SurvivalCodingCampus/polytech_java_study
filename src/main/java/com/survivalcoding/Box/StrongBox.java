package com.survivalcoding.Box;

public class StrongBox<E> {
    private E data;
    private KeyType keyType;
    private int count = 0;

    public void put(E data) {
        this.data = data;
    }

    StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public E get() {
        this.count++;

        if (count == 1024 && keyType == KeyType.PADLOCK) {
            return data;
        } else if (count == 10000 && keyType == KeyType.BUTTON) {
            return data;
        } else if (count == 30000 && keyType == KeyType.DIAL) {
            return data;
        } else if (count == 1000000 && keyType == KeyType.FINGER) {
            return data;
        } else {
            return null;
        }
    }


}


