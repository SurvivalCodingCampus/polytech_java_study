package com.survivalcoding;

// super class인 Hero의 상속을 받는 sub-class인 SuperHero
public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp) {
        super(name, hp);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override // 주석이지만 명확하게 하기 위해서 적음
    public void run() {
        System.out.println("오버라이드된 run");
    }

    @Override
    public void attack() {
        super.attack();

        if (isFlying) {
            System.out.println("나는 중");
        }
    }
}
