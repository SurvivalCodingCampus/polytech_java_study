package com.survivalcoding.assignments_01_instance.exam01.generic;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Cleric;

public class Pocket <E extends Character> {
    private E data;

    public void put(E data){
        this.data=data;
    }

    public E getData() {
        return data;
    }

    public static void main(String[] args){
        Pocket<String> pocket = new Pocket<>();
        pocket.put("111");

        String name = pocket.get();
        System.out.println(name);

        Pocket<Character> pocket1 = new Pocket<>();
        pocket1.put(new Cleric("11"));
    }
}
