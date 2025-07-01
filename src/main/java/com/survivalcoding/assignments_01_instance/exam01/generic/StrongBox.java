package com.survivalcoding.assignments_01_instance.exam01.generic;

public class StrongBox<E> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return this.data;
    }
}
