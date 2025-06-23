package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard {
    private int mp = 150;

    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    void heal (Hero hero) {
        if (mp >= 5) {
            mp -= 5;
            hero.setHp(hero.getHp() + 25);

            System.out.println("HP: "+ hero.getHp());
        }

        else {
            System.out.println("마나가 부족합니다.");
        }
    }

    void superHeal (Hero hero) {
        if (mp >= 50) {
            mp -= 50;
            hero.setHp(hero.getMaxHp());

            System.out.println("HP: "+ hero.getHp());
        }

        else {
            System.out.println("마나가 부족합니다.");
        }
    }

}
