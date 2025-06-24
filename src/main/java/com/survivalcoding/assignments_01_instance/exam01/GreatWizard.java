package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard extends Wizard {
    private int mp;

    public GreatWizard(int hp, int mp, String name, Wand wand) {
        super(hp, mp, name, wand);
    }
    public GreatWizard(int hp, String name, Wand wand) {
        super(hp, 150, name, wand);
    }


    @Override
    void heal(Hero hero) {
        int recoveryPoint = 25;

        if ( mp > 0) {
             mp -= 5;
            hero.setHp(hero.getHp() + recoveryPoint);
            System.out.println("힐을 시전했습니다. 대상의 HP : " + hero.getHp());
        }
        else {
            System.out.println("마나가 부족합니다");
        }
    }

   void superHeal(Hero hero) {
        int superRecoveryPoint = hero.getHp();
        if ( mp >= 50) {
             mp -= 50;
            hero.setHp(hero.getHp() + superRecoveryPoint);
            System.out.println("슈퍼 힐을 시전했습니다. 대상 HP : " + hero.getHp());

        }
        else {
            heal(hero);
        }
   }

}

