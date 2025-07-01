package com.survivalcoding.eight;

public class StrongBox<E> {
    private E obj;


    public void put(E obj) {
        this.obj = obj;
    }

    public E get() {
        return this.obj;
    }

}
