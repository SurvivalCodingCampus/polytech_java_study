package com.survivalcoding.assignments_01_instance.exam01.generic;

import com.survivalcoding.assignments_01_instance.exam01.Hero;

public class Pocket<E> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return data;
    }

    public static void main(String[] args) {
        Pocket<String> pocket = new Pocket();
        pocket.put("111");
        // pocket.put(111);  스트링이라 빨간줄
        // pocket.put(true); 스트링이라 빨간줄

        String name = pocket.get(); //캐스팅 필요 없음
        System.out.println(name);

        Pocket<Hero> pocket1 = new Pocket<>();
    }
}
