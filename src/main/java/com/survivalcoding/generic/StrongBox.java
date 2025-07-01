package com.survivalcoding.generic;

public class StrongBox<E> {
    private E instance;

    public E getInstance() {
        return instance;
    }

    public void put(E instance) {
        this.instance = instance;
    }
}
