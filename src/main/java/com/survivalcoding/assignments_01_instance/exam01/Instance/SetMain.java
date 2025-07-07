package com.survivalcoding.assignments_01_instance.exam01.Instance;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Hero;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args){
        Set<Hero> heroes=new HashSet<>();

        Hero hero1=new Hero("슈퍼맨", 100);
        Hero hero2=new Hero("슈퍼맨", 100);

        heroes.add(hero1);
        System.out.println(heroes.size());

        heroes.remove(hero2);
        System.out.println(heroes.size());

        System.out.println(hero1==hero2);
        System.out.println(hero1.equals(hero2));
    }
}
