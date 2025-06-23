package com.survivalcoding;

public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp)
    {
        super(name, hp);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run() {
        System.out.println("멋지게 퇴각했다.");
    }

    @Override
    public void attack(Kinoko kinoko) {
        super.attack(kinoko);

        if(isFlying)
        {
            kinoko.setHp(kinoko.getHp() - 5);
            System.out.println("5포인트의 피해를 입혔다");
        }
    }

    public static void main(String[] args)
    {
        Hero hero = new Hero("홍길동", 100);
        hero.run();

        SuperHero superHero = new SuperHero("한석봉", 50);
        superHero.run();
    }
}
