package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard(int hp, String name, Wand wand) {
        super(hp, 150, name, wand);
    }

    @Override
    public void heal(Hero hero) {
        if (getMp() < 5) {
            System.out.println("마나 부족합니다.");
        }
        setMp(getMp() - 5);
        hero.setHp(hero.getHp() + 25);
    }

    public void superHeal(Hero hero) {
        if (getMp() < 50) {
            System.out.println("마나 부족합니다.");
        }
        setMp(getMp() - 50);
        hero.setHp(Hero.MAX_HP);
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}
