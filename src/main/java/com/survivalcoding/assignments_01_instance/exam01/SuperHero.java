package com.survivalcoding.assignments_01_instance.exam01;

public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp){
        super(name, hp);
    }

    public boolean isFlying(){
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run(){
        System.out.println("오버라이드된 run");
    }

    @Override
    public void attack(Kinoko kinoko){
        super.attack(kinoko);

        if(isFlying){
            System.out.println("날고 있다");
        }
        super.attack(kinoko);
    }

    public static void main(String[] args){
        Hero hero=new Hero("aaa", 10);

        SuperHero superHero = new SuperHero("aaa", 10);
        superHero.run();

        superHero.setFlying(true);
        superHero.attack(new Kinoko());
    }
}
