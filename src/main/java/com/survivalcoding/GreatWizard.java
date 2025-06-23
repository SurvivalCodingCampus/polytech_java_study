package com.survivalcoding;

public class GreatWizard extends Wizard {
    private int mp = 150;

    public GreatWizard(String name, int hp, int mp, Wand wand) {
        super(name, hp, mp, wand);
    }

    public GreatWizard(String name, Wand wand) {
        super(name, wand);
    }

    // methods
    public void heal(Hero hero) {
        if (hero == null) throw new IllegalArgumentException("Heal must have an ally as a target");
        if (getMp() < 5) {
            System.out.println("마나가 부족합니다.");
            throw new IllegalArgumentException("Insufficient MP");
        }
        setMp(getMp() - 5);

        hero.setHp(hero.getHp() + 25);
        System.out.println("힐을 시전했습니다. 대상 HP : " + hero.getHp());
    }

    // methods
    public void superHeal(Hero hero) {
        if (hero == null) throw new IllegalArgumentException("Heal must have an ally as a target");
        if (getMp() < 50) {
            System.out.println("마나가 부족합니다.");
            throw new IllegalArgumentException("Insufficient MP");
        }
        setMp(getMp() - 50);

        hero.setHp(hero.getMaxHp());
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP : " + hero.getHp());
    }
}
