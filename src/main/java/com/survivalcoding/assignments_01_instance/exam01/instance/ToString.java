package com.survivalcoding.assignments_01_instance.exam01.instance;

import com.survivalcoding.assignments_01_instance.exam01.Hero;

public class ToString {
    public static void main(String[] args) {
        Object object = new Hero("aaa", 10);
        object = 10;
        object = true;
        object = null;

        Hero hero1 = new Hero("hero", 10);
        Hero hero2 = new Hero("hero", 10);
        System.out.println(hero1.hashCode());
        System.out.println(hero2.hashCode());  // 이름이 같으니까 hashCode도 같아짐

    }
}
