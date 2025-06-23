package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard extends Wizard {
    private int mp = 150;

    public GreatWizard(String name, int hp, Wand wand) {
        super(name, hp, wand);
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
    public void heal(Hero hero) {
        int usePoint = 5;
        int recovPoint = 25;
        hero.setHp(hero.getHp() + recovPoint);  //hero의 hp 25 회복
        this.setMp(this.getMp() - usePoint);  //자신의 mp 5 소모
        System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());

        if (this.getMp() < 5) {
            System.out.println("마나가 부족합니다.");
        }
    }
}
