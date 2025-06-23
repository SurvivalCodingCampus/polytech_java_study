package com.survivalcoding;

public class GreatWizard extends Wizard{
    private static int mp = 150;
    public GreatWizard(int hp, int mp, String name, Wand wand) {
        super(hp, mp, name, wand);
    }

    @Override
    void heal(Hero hero) {
        super.heal(hero);
        int recovHp = 25;

        if(mp > 10)
        {
            GreatWizard.mp -= 5;
            hero.setHp(hero.getHp() + recovHp);

            System.out.println("힐을 시전했습니다. 대상 HP:" + hero.getHp());
        }
    }

    public void superHeal(Hero hero, int max_hp)
    {
        if(mp < 50)
        {
            System.out.println("마나가 부족합니다");
        }
        else
        {
            int recovHp = max_hp - hero.getHp();

            GreatWizard.mp -= 50;
            hero.setHp(max_hp);

            System.out.println("슈퍼 힐을 시전하였습니다. 대상 HP: " + recovHp);
        }
    }
}
