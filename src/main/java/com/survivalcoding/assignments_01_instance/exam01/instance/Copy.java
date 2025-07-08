package com.survivalcoding.assignments_01_instance.exam01.instance;

import com.survivalcoding.assignments_01_instance.exam01.Hero;

public class Copy {
    public static void main(String[] args) {
        int i = 10;
        int j = i;

        i = 11;

        System.out.println(j);


        Hero h1 = new Hero("홍길동", 10);
        Hero h2 = new Hero(h1.getName(), h1.getHp());  // 이게 복사
        h2.setSword((h1.getSword()));  // 주소만 복사됨, 값이 복사된 건 아님 칼 하나를 둘이 같이 씀 (얕은 복사)

        Hero h3 = h1.clone(); // Clonable 인터페이스 활용해서 복사 (깊은 복사)

        // h2.setSword(new Sword(h1.getSword().name)); // 깊은 복사

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1 == h2);  // false 메모리는 달라
        System.out.println(h1.equals(h2)); // true
    }
}
