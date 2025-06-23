package com.survivalcoding.class_3;

public class PoisonSlime extends Slime {
    private int poisonCount;
    private final int setPoison = 5;

    PoisonSlime(String s) {
        super(s);
        poisonCount = setPoison;
    }

    PoisonSlime(String s, int hp) {
        super(s, hp);
        poisonCount = setPoison;
    }

    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonCount != 0) {
            System.out.println("추가로, 독 포자를 살표했다!");
            int poisonD = hero.getHp() / 5;

            hero.setHp(hero.getHp() - poisonD);
            System.out.println(poisonD + "포인트의 데미지");
            poisonCount--;
        }
    }

}
