package com.survivalcoding.assignments_01_instance.exam01;


public class SuperHero extends Hero {
    private boolean isFlying; // 필드 추가

    // Super의 생성자 호출
    public SuperHero(String name, int hp) {
        super(name, hp);
    }

    // 추가한 메소드들
    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run() {
        System.out.println("Superrun");
    }


    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("Hero", 100);
        superHero.run();
    }
}
