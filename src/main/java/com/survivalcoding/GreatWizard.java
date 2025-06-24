package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard(String name) {
        super(name);
        this.setMp(150); // mp 초기값을 150으로 설정
    }

    @Override
    public void heal(Hero hero) {
        if (this.getMp() < 5) {
            System.out.println("마나가 부족합니다");
        } else {
            this.setMp(this.getMp() - 5);
            hero.setHp(hero.getHp() + 25);
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        }
    }

    public void superHeal(Hero hero) {
        if (this.getMp() < 50) {
            System.out.println("마나가 부족합니다");
        } else {
            this.setMp(this.getMp() - 50);
            hero.setHp(100); // HP를 최대치로 회복
            System.out.println("슈퍼 힐을 시전했습니다. 대상 HP: " + hero.getHp());
        }
    }
}
