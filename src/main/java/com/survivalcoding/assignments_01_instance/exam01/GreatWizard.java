package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard extends Wizard{

    private int mp = 150;

    public GreatWizard() {
        super();
    }

    public GreatWizard(int hp, int mp, String name, Wand wand) {
        super(hp, mp, name, wand);
        this.mp = mp;
    }

    @Override
    public int getMp() {
        return mp;
    }

    @Override
    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public void heal(Healable healable) {
        if (mp - 5 < 0) {
            System.out.println("마나가 부족합니다.");
            return;
        }
        mp -= 5;
        int basePoint = 25;
        healable.beHealed(basePoint);
        System.out.println("힐을 시전했습니다. 대상 HP : " + healable.getHp());
    }

    public void superHeal(Healable healable) {
        if (mp - 50 < 0) {
            System.out.println("마나가 부족합니다.");
            return;
        }
        mp -= 50;
        healable.beHealed(healable.getMaxHp());
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP : " + healable.getHp());
    }
}
