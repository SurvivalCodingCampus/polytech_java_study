package com.survivalcoding.Box;

public class StrongBox<E> {
    private E data;
    private KeyType keyType;
    private int count = 0;

    public void put(E data) {
        this.data = data;
    }

    enum KeyType {
        PADLOCK(1024),
        BUTTON(10000),
        DIAL(30000),
        FINGER(1000000);

        private int value;

        KeyType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public E get() {
        this.count++;
        switch (keyType) {
            case PADLOCK:
                System.out.println("PADLOCK");
                break;
            case BUTTON:
                System.out.println("BUTTON");
                break;
            case DIAL:
                System.out.println("DIAL");
                break;
            case FINGER:
                System.out.println("FINGER");
                break;
            default:
                return null;
        }

        return this.data;
    }


}


