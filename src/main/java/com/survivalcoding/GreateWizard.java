package com.survivalcoding;

public class GreateWizard extends Wizard {
    public static final int maxHp = Wizard.maxHp + 50;
    public static final int maxMp = Wizard.maxMp + 50;

    public GreateWizard(String name) {
        this(name, new Wand("대마법사 지팡이"), GreateWizard.maxHp, GreateWizard.maxMp);
    }

    public GreateWizard(String name, Wand wand, int hp, int mp) {
        super(name, wand, hp, mp);
    }

    @Override
    public void heal(Hero hero) {
        if(this.getMp() < 5) {
            System.out.println("마나가 부족합니다.");
            return;
        }

        hero.setHp(hero.getHp() + 25);
        super.setMp(super.getMp() - 5);
    }

    public void superHeal(Hero hero) {
        if(this.getMp() < 50) {
            System.out.println("마나가 부족합니다.");
            return;
        }

        hero.setHp(Hero.maxHp);
        super.setMp(super.getMp() - 50);
        System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
    }

    public boolean checkCurrentMp() {
        return false;
    }
}
