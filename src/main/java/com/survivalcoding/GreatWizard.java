package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard(int hp, String name, Wand wand) {
        super(hp, 150, name, wand);
    }

    @Override
    public void heal(Hero hero) {
        hero.setHp(hero.getHp() + 25);
        setMp(getMp() - 5);
    }

    public void superHeal(Hero hero) {
        hero.setHp(Hero.MAX_HP);
        setMp(getMp() - 50);
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }
}
