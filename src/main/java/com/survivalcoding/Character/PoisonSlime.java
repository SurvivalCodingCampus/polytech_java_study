package com.survivalcoding.Character;

public class PoisonSlime extends Slime {
    private int poisonCount;

    public PoisonSlime(String suffix) {
        super(suffix);
        poisonCount = 5;
    }

    public int getPoisonCount() {
        return poisonCount;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (getPoisonCount() > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");

            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);

            System.out.println(poisonDamage + "포인트의 데미지");

            poisonCount--;
        }
    }
}
