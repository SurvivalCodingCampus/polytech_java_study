package com.survivalcoding.generic;

public class StrongBox<E> {
    private int Count;
    private final KeyType keytype;
    private E Data;

    private StrongBox(E data, KeyType keytype) {
        this.keytype = keytype;
    }

    private KeyType getKeytype() {
        return keytype;
    }

    private void put(E data) {
        this.Data = data;
    }

    E getData(E data) {
        return this.Data;
    }

    public E getPADLOCK() {
        if (Count <= 1024) {
            Count++;
            return null;
        }
        return Data;
    }

    public E getBUTTON() {
        if (Count <= 10000) {
            Count++;
            return null;
        }
        return Data;
    }

    public E getDIAL() {
        if (Count <= 30000) {
            Count++;
            return null;
        }
        return Data;
    }

    public E getFINGER() {
        if (Count <= 1000000) {
            Count++;
            return null;
        }
        return Data;
    }

}