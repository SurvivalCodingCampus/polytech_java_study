package com.survivalcoding.assignments_01_instance.exam01.Instance;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Hero;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args){
        List<Hero> heroes=new ArrayList<>();

        Hero hero1=new Hero("슈퍼맨", 100);
        Hero hero2=new Hero("슈퍼맨", 100);

        heroes.add(hero1);
        System.out.println(heroes.size());

        heroes.add(hero2);
        System.out.println(heroes.size());

        System.out.println(hero1==hero2);
        System.out.println(hero1.equals(hero2));
    }
}
