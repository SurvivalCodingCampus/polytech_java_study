package com.survivalcoding;

public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp) {
        super(name, hp); // 부모 생성자 호출!
        System.out.println("SuperHero의 생성자");
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void fly() {
        isFlying = true;
    }

    public void land() {
        isFlying = false;
    }

    @Override
    public void run() {
        System.out.println("멋지게 퇴각했다");
    }

    @Override
    public void attack(Slime slime) {
        super.attack(slime); // 부모의 attack도 그대로 실행
        if (isFlying) {
            slime.setHp(slime.getHp() - 5);
            System.out.println("5포인트의 추가 피해를 입혔다");
        }
    }
}

