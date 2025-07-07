package com.survivalcoding.assignments_01_instance.exam01.instance;

import com.survivalcoding.assignments_01_instance.exam01.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        Collections.sort(numbers);
        System.out.println(numbers);

        List<String> names = new ArrayList<>();

        names.add("한석봉");
        names.add("김삿갓");
        names.add("이순신");

        Collections.sort(names);
        System.out.println(numbers);

        List<Hero> heros = new ArrayList<>();

        heros.add(new Hero("한석봉", 20));
        heros.add(new Hero("김수한무", 20));
        heros.add(new Hero("이순신", 20));
        Collections.sort(names);
        System.out.println(numbers);
    }

}
