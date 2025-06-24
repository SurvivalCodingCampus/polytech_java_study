package com.survivalcoding.class_3;

public class GreatWizard extends Wizard {
    private final int defaultMP = 150;

    GreatWizard() {
        super();
        this.setMp(defaultMP);
    }

    @Override
    public void heal(Hero hero) {
        if ((this.getMp() - 5) >= 0) {
            hero.setHp(hero.getHp() + 25);
            this.setMp(this.getMp() - 5);
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }

    public void superHeal(Hero hero) {
        if ((this.getMp() - 50) >= 0) {
            hero.setHp(MAX_HP);
            this.setMp(this.getMp() - 50);
            System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
        } else {
            System.out.println("마나가 부족합니다");
        }
    }


}
