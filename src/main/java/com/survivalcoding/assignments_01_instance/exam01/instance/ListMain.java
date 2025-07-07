package com.survivalcoding.assignments_01_instance.exam01.instance;

import com.survivalcoding.assignments_01_instance.exam01.Hero;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();

        Hero hero1 = new Hero("슈퍼맨, 100");
        Hero hero2 = new Hero("슈퍼맨, 100");

        heros.add(hero1);
        System.out.println(heros.size()); // 1

        heros.remove(hero2);
        System.out.println(heros.size()); // 1

        System.out.println(hero1 == hero2); // false <- 주소 비교
        System.out.println(hero1.equals(hero2)); // 이름만으로 동등성 체크

    }
}
