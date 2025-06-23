package com.survivalcoding;

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

    @Override
    public void run() {
        System.out.println("SuperHero Run\n");
    }

    @Override
    public void attack(Kinoko kinoko) {
        super.attack(kinoko);
        if (isFlying) {
            System.out.println("날고있다다다\n");
        }
    }

    public static void main(String[] args) {
        SuperHero superHero = new SuperHero("SuperHero", 10);
        superHero.run();
        superHero.attack(new Kinoko());
    }
}
