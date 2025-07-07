package com.survivalcoding.instance;

import com.survivalcoding.Cleric;
import com.survivalcoding.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(numbers);


        List<String> names = new ArrayList<>();

        names.add("한석봉");
        names.add("김삿갓");
        names.add("이순신");

        Collections.sort(names);
        System.out.println(names);

        List<Hero> heroes = new ArrayList<>();

        heroes.add(new Hero("한석봉", 20));
        heroes.add(new Hero("김삿갓", 30));
        heroes.add(new Hero("이순신", 10));

        Collections.sort(heroes);
        System.out.println(heroes);


        List<Cleric> clerics = new ArrayList<>();
        clerics.add(new Cleric("bb", 30));
        clerics.add(new Cleric("aa", 10));
        clerics.add(new Cleric("cc", 20));

        Collections.sort(clerics, new Comparator<Cleric>() {
            @Override
            public int compare(Cleric o1, Cleric o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(clerics);
    }
}
