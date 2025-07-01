package com.survivalcoding.Box;

public class StrongBox<E> {
    private E data;

    public StrongBox(E data) {
        put(data);
    }

    public E get() {
        return data;
    }

    public void put(E data) {
        this.data = data;
    }
}
