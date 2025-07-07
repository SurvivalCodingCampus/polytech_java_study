package com.survivalcoding.instance;

import com.survivalcoding.Hero;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();

        Hero hero1 = new Hero("슈퍼맨", 100);
        Hero hero2 = new Hero("슈퍼맨", 100);

        heroes.add(hero1);
        System.out.println(heroes.size());  // 1

        heroes.remove(hero2);
        System.out.println(heroes.size());  // 1

        System.out.println(hero1 == hero2); // 주소 비교 : false
        System.out.println(hero1.equals(hero2));    // 이름만으로 동등성 체크

    }
}
