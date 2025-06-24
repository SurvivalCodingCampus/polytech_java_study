package com.survivalcoding;

public class GreatWizard extends Wizard {

    GreatWizard(int hp, int mp, String name, Wand wand) {
        super(hp, 150, name, wand);
    }

    @Override
    public void heal(Hero hero) {
        super.heal(hero);
        hero.setHp(hero.getHp() + 25);
        super.setMp(super.getMp() - 5);

        if (this.getMp() <= 0) {
            System.out.println("마나가 부족합니다.");
        }

    }

    public void superHeal(Hero hero) {
        if (this.getMp() >= 50) {
            hero.setHp(Cleric.MAX_HP);
            hero.setHp(super.getMp() - 50);

            System.out.println(getHp() + "슈퍼 힐을 시전했습니다. 대상 HP :");

        } else {
            System.out.println("마나가 부족합니다.");

        }
    }

}
