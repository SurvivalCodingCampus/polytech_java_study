package com.survivalcoding.generic;

public class Pocket<E> {
    private E data;

    public void put(E data) {
        this.data = data;
    }
    public E get() {
        return data;
    }

    public static void main(String[] args) {
        Pocket<String> pocket = new Pocket<>();
        pocket.put("111");

        String name = (String) pocket.get();
        System.out.println(name);

    }
}
