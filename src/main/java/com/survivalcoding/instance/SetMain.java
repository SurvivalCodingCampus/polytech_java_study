package com.survivalcoding.instance;

import com.survivalcoding.Hero;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Hash 값 기준으로
        Set<Hero> heroes = new HashSet<>();

        Hero hero1 = new Hero("슈퍼맨", 100);
        Hero hero2 = new Hero("슈퍼맨", 100);

        heroes.add(hero1);
        System.out.println(heroes.size());  // 1

        heroes.remove(hero2);
        System.out.println(heroes.size());  // 0   ?????????

        System.out.println(hero1 == hero2); // false
        System.out.println(hero1.equals(hero2));    // true
    }
}
