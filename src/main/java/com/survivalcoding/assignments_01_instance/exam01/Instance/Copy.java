package com.survivalcoding.assignments_01_instance.exam01.Instance;

import com.survivalcoding.assignments_01_instance.exam01.Monster.Hero;
import com.survivalcoding.assignments_01_instance.exam01.Monster.Sword;

import java.util.Calendar;
import java.util.Date;

public class Copy {
    public static void main(String[] args) {
        int i = 10;
        int j = i;

        i = 11;

        System.out.println(j);

        Hero hero1 = new Hero("홍길동", 10);

        //얕은 복사
        Hero hero2 = new Hero(hero1.getName(), hero1.getHp());
        hero2.setSword(hero1.getSword());

        //깊은 복사1
        Hero hero3 = new Hero(hero1.getName(), hero1.getHp());
        hero2.setSword(new Sword(hero1.getSword().name));

        //깊은 복사2: Cloneable 인터페이스 활용
        Hero hero4 = hero1.clone();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2010);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        Date date = calendar.getTime();

        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero1 == hero2);
        System.out.println(hero1.equals(hero2));
    }
}