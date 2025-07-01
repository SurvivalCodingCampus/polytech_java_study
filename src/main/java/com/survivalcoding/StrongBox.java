package com.survivalcoding;

public class StrongBox<K> {
    private K item;
    public void put(K item) {
        this.item = item;
    }

    public K get() {
        return this.item;
    }
}
