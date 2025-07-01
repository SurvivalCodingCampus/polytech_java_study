package com.survivalcoding.assignments_01_instance.exam01;

public class StrongBox<E> {
    private E data;

    public void put(E data) {
        if (this.data != null) {
            return;
        }
        this.data = data;
    }

    public E get() {
        return this.data;
    }
}
