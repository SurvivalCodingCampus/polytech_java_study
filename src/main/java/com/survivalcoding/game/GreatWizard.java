package com.survivalcoding.game;

public class GreatWizard extends Wizard {
    GreatWizard(int hp, int mp, String name, Wand wand) {
        super(hp, Math.max(mp, 150), name, wand);

    }

    @Override
    public void heal(Hero hero) {
        if (getMp() > 5) {
            hero.setHp(hero.getHp() + 25);
            setMp(getMp() - 5);
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }


    public void superHeal(Hero hero) {
        if (getMp() > 50) {
            hero.setHp(100);
            setMp(getMp() - 50);
            System.out.println("슈퍼힐을 시전했습니다. 대상 HP: " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }
}
