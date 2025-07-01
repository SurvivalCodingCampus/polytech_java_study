package com.survivalcoding;

public class StrongBox<T> {
    /* private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    } */

    private T item;
    private final KeyType keyType;
    private int accessCount = 0;
    private boolean isEmpty = true;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(T item) {
        if (!isEmpty) {
            throw new IllegalStateException("StrongBox already contains an item.");
        }
        this.item = item;
        isEmpty = false;
    }

    public T get() {
        if (isEmpty) {
            throw new IllegalStateException("StrongBox is empty.");
        }

        accessCount++;
        if (accessCount >= keyType.getUsageLimit()) {
            T temp = item;
            item = null;
            isEmpty = true;
            return temp;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
       /* StrongBox<String> stringBox = new StrongBox<>();
        stringBox.put("Hello");

        String value = stringBox.get();
        System.out.println(name); */

        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("Secret Document");


        for (int i = 0; i < 1024; i++) {
            String result = box.get();
            if (result != null) {
                System.out.println("Retrieved: " + result);
            }
        }
    }
}
