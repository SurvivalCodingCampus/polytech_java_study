package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int poisonDMG = hero.getHp() / 5;
            System.out.println(poisonDMG + "포인트의 데미지");

            int resultHP = hero.getHp() - poisonDMG;
            hero.setHp(resultHP);
            poisonCount--;
        }
    }
}
