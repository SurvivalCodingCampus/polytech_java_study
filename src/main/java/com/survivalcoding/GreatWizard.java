package com.survivalcoding;

public class GreatWizard extends Wizard{

    private int mp = 150;
    private int hp;

    public GreatWizard(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public void heal(Hero hero){
        mp = getMp()-5;
        hero.Hp = hero.getHp()+25;

        if(getMp()<5){
            System.out.println("마나가 부족합니다!");
        }
        else{
            System.out.println("힐을 시전했습니다. 대상 HP: "+hero.getHp());
        }
    }

    public void superHeal(Hero hero){
        mp = getMp()-50;
        hero.setHp(100);

        if(getMp()<50){
            System.out.println("마나가 부족합니다!");
        }
        else{
            System.out.println("힐을 시전했습니다. 대상 HP: " + hero.getHp());
        }

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
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
}
