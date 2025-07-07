package com.survivalcoding.Box;

public class StrongBox<E> {
    private E data;
    private int count;
    private KeyType keyType;


    public StrongBox(E data, KeyType keyType) {
        put(data);
        this.count = 0;
        this.keyType = keyType;
    }

    public E get() {

        this.count++;
        switch (keyType) {
            case PADLOCK: {
                if (1024 > count) return null;
                else return this.data;
            }
            case BUTTON: {
                if (10000 > count) return null;
                else return this.data;
            }
            case DIAL: {
                if (30000 > count) return null;
                else return this.data;
            }
            case FINGER: {
                if (1000000 > count) return null;
                else return this.data;
            }
            default:
                throw new IllegalStateException("지원하지 않는 KeyType입니다: " + keyType);

        }
    }

    public void put(E data) {
        this.data = data;
    }

}
