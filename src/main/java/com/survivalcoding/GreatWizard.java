package com.survivalcoding;

public class GreatWizard extends Wizard {


    public GreatWizard(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public GreatWizard(String name, int hp) {
        super(name, hp, 150);

    }


    public void heal(Hero hero) {
        setMp(getMp() - 5);
        hero.setHp( hero.getHp() + 25);

        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());

        if (getMp() < 5) {
            System.out.println("마나가 부족합니다!");
            throw new IllegalArgumentException("마나가 부족합니다링");
        }
    }

    public void superHeal(Hero hero) {
        setMp( getMp() - 50);
        hero.setHp(100);

        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());

        if (getMp() < 50) {
            System.out.println("마나가 부족합니다!");
            throw new IllegalArgumentException("마나가 부족합니다링");
        }

    }

}
