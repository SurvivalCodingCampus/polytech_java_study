package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard extends Wizard {
}
public void heal(Hero hero){
    //mp가 부족하면 "마나가 부족합니다" 출력
    if(mp < 10){
        throw new IllegalArgumentException("마나가 부족합니다");
    }
    int basePoint=10;
    int recovPoint=(int) (basePoint*this.wand.power);
    hero.setHp(hero.getHp()+recovPoint);
    //힐을 성공하면 "힐을 시전했습니다. 대상 HP: XX" 출력
}
 //void superHeal(Hero hero) : hp를 전부 회복시키고 자신의 mp를 50 소모
public void superheal(Hero hero){
    //mp가 부족하면 "마나가 부족합니다" 출력
    if(mp < 50){
        throw new IllegalArgumentException("마나가 부족합니다");
    }
    int basePoint=10;
    int recovPoint=(int) (basePoint*this.wand.power);
    hero.setHp(hero.getHp()+recovPoint);
    //힐을 성공하면 "슈퍼힐을 시전했습니다. 대상 HP: XX" 출력
}