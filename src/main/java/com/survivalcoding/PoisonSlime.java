package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;  // 수정 금지

    public PoisonSlime(String suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount > 0) {
            System.out.println("\n추가로, 독 포자를 살포했다!");

            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);

            System.out.println(poisonDamage + "데미지! \n");
            poisonCount--;
        }
    }
}
