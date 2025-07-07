package com.survivalcoding.instance;

import com.survivalcoding.Hero;
import com.survivalcoding.Sword;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Copy {
    public static void main(String[] args) {
        int i = 10;
        int j = i;

        i = 11;

        System.out.println(j);  // 10

        Hero hero1 = new Hero("홍길동", 10);

        // 얕은 복사
        Hero hero2 = new Hero(hero1.getName(), hero1.getHp());
        hero2.setSword(hero1.getSword());

        // 깊은 복사 1
        Hero hero3 = new Hero(hero1.getName(), hero1.getHp());
        hero2.setSword(new Sword(hero1.getSword().name));

        // 깊은 복사 2 : Cloneable 인터페이스 활용
        Hero hero4 = hero1.clone();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2010);
        calendar.set(Calendar.MONTH, 10);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        Date date = calendar.getTime();


//        LocalDate localDate = LocalDate.of(1000, 10, 10);
//        LocalDate newLocalDate = LocalDate.of(localDate.getYear(), )


//        hero2.setSword(new Sword(hero1.getSword().name));

        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero1 == hero2);     // 메모리 달라
        System.out.println(hero1.equals(hero2));    // true
    }
}
