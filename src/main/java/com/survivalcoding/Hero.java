package com.survivalcoding;

import java.util.Random;

public class Hero {

    //공유 지원
    public static int money = 100;
    //private 자원
    private String name; // null 초기화 가능
    private int hp; // 0 초기화 가능
    private Sword sword; // null 초기화 가능


    public void run() {

    }

    //  hp 필드를 외부와 읽기 가능하도록 구현 - getter
    public int getHp() {
        return hp;
    }

    // hp 필드를 외부와 값 변경 가능하도록 구현 - setter
    public void setHp(int hp) {
        if (hp < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            throw new IllegalArgumentException("hp는 음수가 될 수 없다.");
        }
        this.hp = hp;
    }

    // NAME 관련 get, set
    public String getName() {
        return name; // 외부에서 Hero.name 메소드를 알 수 있게 해줌
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("이름이 너무 긺");
        }
        this.name = name; // 새로운 값을 변경 가능하게 해줌
    }

    public void attack(Kinoko kinoko) {

    }

    public void bye() {

    }

    private void die() {

    }

    public Hero(String name, int hp) { // 생성자  -
        //this.name = name;
        //this.hp = hp;
        // 직접 필드에 대입시 set 검증로직 실행 안됨 >> 생성자 내부에서도 setter 사용해 일관된 검증 보장
        setName(name);
        setHp(hp);
    }

    public static void setRandomMoney() {
        // 0-100미만(0-99) 중에서 임의의 정수 하나 반환 > money에 할당
        Hero.money = new Random().nextInt(100); // 인스턴스 - 붕어빵

        Hero hero = new Hero("aaa", 10);
        hero.name = "홍길동";

    }


}
