package com.survivalcoding;

public class SuperHero extends Hero {
    private boolean isFlying;

    public SuperHero(String name, int hp) {
        super(name, hp); // super : 자신이 상속받은 부모를 가리키는 참조변수 super
    }


    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }


}
